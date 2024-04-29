package com.koreait.exam.acc_app_2024_04.app.cash.service;

import com.koreait.exam.acc_app_2024_04.app.cash.entity.CashLog;
import com.koreait.exam.acc_app_2024_04.app.cash.repository.CashRepository;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.member.exception.AlreadyJoinException;
import com.koreait.exam.acc_app_2024_04.app.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class CashService {
   private final CashRepository cashRepository;

   public CashLog addCash(Member member, long price, String eventType){
      CashLog cashLog = CashLog.builder()
          .member(member)
          .price(price)
          .eventType(eventType)
          .build();

      cashRepository.save(cashLog);

      return cashLog;
   }


}