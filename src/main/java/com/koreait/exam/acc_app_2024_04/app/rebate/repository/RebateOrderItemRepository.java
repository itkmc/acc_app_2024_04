package com.koreait.exam.acc_app_2024_04.app.rebate.repository;

import com.koreait.exam.acc_app_2024_04.app.rebate.entity.RebateOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RebateOrderItemRepository extends JpaRepository<RebateOrderItem, Long> {
   Optional<RebateOrderItem> findByOrderItemId(long orderItemId);
}