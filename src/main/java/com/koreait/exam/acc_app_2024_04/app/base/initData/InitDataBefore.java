package com.koreait.exam.acc_app_2024_04.app.base.initData;

import com.koreait.exam.acc_app_2024_04.app.cart.entity.CartItem;
import com.koreait.exam.acc_app_2024_04.app.cart.service.CartService;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.member.service.MemberService;
import com.koreait.exam.acc_app_2024_04.app.product.entity.Product;
import com.koreait.exam.acc_app_2024_04.app.product.service.ProductService;
import com.koreait.exam.acc_app_2024_04.app.song.entity.Song;
import com.koreait.exam.acc_app_2024_04.app.song.service.SongService;

public interface InitDataBefore {
   default void before(MemberService memberService, SongService songService, ProductService productService, CartService cartService) {
      Member member1 = memberService.join("user1", "1234", "user1@test.com");
      Member member2 = memberService.join("user2", "1234", "user2@test.com");

      Song song1 = songService.create(member1, "노래 1", "내용 1");
      Song song2 = songService.create(member1, "노래 2", "내용 2");
      Song song3 = songService.create(member2, "노래 3", "내용 3");
      Song song4 = songService.create(member2, "노래 4", "내용 4");
      Song song5 = songService.create(member1, "노래 5", "내용 5");
      Song song6 = songService.create(member1, "노래 6", "내용 6");
      Song song7 = songService.create(member2, "노래 7", "내용 7");
      Song song8 = songService.create(member2, "노래 8", "내용 8");

      Product product1 = productService.create(song1, "제목1", 1_900);
      Product product2 = productService.create(song3, "제목2", 2_900);
      Product product3 = productService.create(song5, "제목3", 3_900);
      Product product4 = productService.create(song7, "제목4", 4_900);
      Product product5 = productService.create(song8, "제목5", 5_900);

//        productService.modify(product1,"제목1-1",3_800);

      CartItem cartItem1 = cartService.addItem(member1, product1);
      CartItem cartItem2 = cartService.addItem(member1, product2);
      CartItem cartItem3 = cartService.addItem(member2, product3);
      CartItem cartItem4 = cartService.addItem(member2, product4);
   }
}