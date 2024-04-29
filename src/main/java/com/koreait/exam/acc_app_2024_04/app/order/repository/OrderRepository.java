package com.koreait.exam.acc_app_2024_04.app.order.repository;

import com.koreait.exam.acc_app_2024_04.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}