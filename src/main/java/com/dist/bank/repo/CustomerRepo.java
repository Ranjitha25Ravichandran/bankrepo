package com.dist.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dist.bank.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
