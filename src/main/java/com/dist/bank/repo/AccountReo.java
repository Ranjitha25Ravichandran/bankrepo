package com.dist.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dist.bank.entity.Account;
@Repository
public interface AccountReo extends JpaRepository<Account, Long> {

}
