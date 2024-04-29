package com.koreait.exam.acc_app_2024_04.app.base.initData;

import com.koreait.exam.acc_app_2024_04.app.cart.service.CartService;
import com.koreait.exam.acc_app_2024_04.app.member.service.MemberService;
import com.koreait.exam.acc_app_2024_04.app.product.service.ProductService;
import com.koreait.exam.acc_app_2024_04.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestInitData implements InitDataBefore {
   @Bean
   CommandLineRunner initData(MemberService memberService, SongService songService, ProductService productService, CartService cartService) {
      return args -> {
         before(memberService, songService, productService, cartService);
      };
   }
}