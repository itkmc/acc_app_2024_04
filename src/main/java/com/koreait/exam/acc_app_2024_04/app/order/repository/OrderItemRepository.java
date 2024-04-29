package com.koreait.exam.acc_app_2024_04.app.order.repository;

import com.koreait.exam.acc_app_2024_04.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}