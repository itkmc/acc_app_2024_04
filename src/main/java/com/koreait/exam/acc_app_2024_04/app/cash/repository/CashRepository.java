package com.koreait.exam.acc_app_2024_04.app.cash.repository;

import com.koreait.exam.acc_app_2024_04.app.cash.entity.CashLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashRepository extends JpaRepository<CashLog, Long> {
}