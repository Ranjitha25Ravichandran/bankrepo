package com.dist.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dist.bank.entity.BankTransaction;

@Repository
public interface BankTransactionRepo extends JpaRepository<BankTransaction, Long> {

}
