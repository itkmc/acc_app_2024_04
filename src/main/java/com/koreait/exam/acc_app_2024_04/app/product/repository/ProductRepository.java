package com.koreait.exam.acc_app_2024_04.app.product.repository;

import com.koreait.exam.acc_app_2024_04.app.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}