package com.koreait.exam.acc_app_2024_04.app.order.repository;

import com.koreait.exam.acc_app_2024_04.app.order.entity.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

   Page<OrderItem> findAllByPayDateBetween(LocalDateTime fromDate, LocalDateTime toDate, Pageable pageable);
}