package com.seunome.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seunome.projeto1.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}