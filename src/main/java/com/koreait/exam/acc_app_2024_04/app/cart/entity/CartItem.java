package com.koreait.exam.acc_app_2024_04.app.cart.entity;

import com.koreait.exam.acc_app_2024_04.app.base.entity.BaseEntity;
import com.koreait.exam.acc_app_2024_04.app.member.entity.Member;
import com.koreait.exam.acc_app_2024_04.app.product.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class CartItem extends BaseEntity {
   @ManyToOne(fetch = LAZY)
   private Member buyer;
   @ManyToOne(fetch = LAZY)
   private Product product;
}