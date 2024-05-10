package com.koreait.exam.acc_app_2024_04.app.product.entity;

import com.koreait.exam.acc_app_2024_04.app.base.entity.BaseEntity;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.song.entity.Song;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
public class Product extends BaseEntity {
   private String subject;
   @ManyToOne(fetch = LAZY)
   private Member author;
   @ManyToOne(fetch = LAZY)
   private Song song;
   private int price;

   public Product(long id) {
      super(id);
   }

   public int getSalePrice() {
      return getPrice();
   }

   public int getWholesalePrice() {
      return (int) Math.ceil(getPrice() * 0.7);
   }

   public boolean isOrderable() {
      return true;
   }

   public String getJdenticon() {
      return "product__" + getId();
   }
}