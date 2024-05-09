package com.koreait.exam.acc_app_2024_04.app.member.service;

import com.koreait.exam.acc_app_2024_04.app.base.dto.RsData;
import com.koreait.exam.acc_app_2024_04.app.cash.entity.CashLog;
import com.koreait.exam.acc_app_2024_04.app.cash.service.CashService;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.member.exception.AlreadyJoinException;
import com.koreait.exam.acc_app_2024_04.app.member.repository.MemberRepository;
import com.koreait.exam.acc_app_2024_04.util.Ut;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
   private final MemberRepository memberRepository;
   private final PasswordEncoder passwordEncoder;
   private final CashService cashService;

   public Member join(String username, String password, String email) {
      if (memberRepository.findByUsername(username).isPresent()) {
         throw new AlreadyJoinException();
      }

      Member member = Member.builder()
          .username(username)
          .password(passwordEncoder.encode(password))
          .email(email)
          .build();

      memberRepository.save(member);

      return member;
   }

   @Transactional(readOnly = true)
   public Optional<Member> findByUsername(String username) {
      return memberRepository.findByUsername(username);
   }

   public RsData<Map<String, Object>> addCash(Member member, long price, String eventType) {
      CashLog cashLog = cashService.addCash(member, price, eventType);

      long newRestCash = member.getRestCash() + cashLog.getPrice();
      member.setRestCash(newRestCash);
      memberRepository.save(member);

      return RsData.of(
          "S-1",
          "성공",
          Ut.mapOf(
              "cashLog", cashLog,
              "newRestCash", newRestCash
          )
      );
   }

   public long getRestCash(Member member) {
      Member foundMember = findByUsername(member.getUsername()).get();

      return foundMember.getRestCash();
   }
}