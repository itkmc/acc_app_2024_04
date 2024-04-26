package com.koreait.exam.acc_app_2024_04.app.base.initData;

import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.member.service.MemberService;

public interface InitDataBefore {
   default void before(MemberService memberService) {
      Member member1 = memberService.join("user1","1234","user1@test.com");
      Member member2 = memberService.join("user2","1234","user2@test.com");
   }
}