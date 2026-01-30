package com.dist.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dist.bank.entity.Customer;
import com.dist.bank.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	public List<Customer> getAllCustomer() {

		return customerRepo.findAll();
	}

	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
	}

	public void updateCustomer(Customer customer) {
		customerRepo.save(customer);
	}

	public void deleteCustomer(long customerId) {
		customerRepo.deleteById(customerId);
	}

	public Customer getCustomer(Long id) {
		return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
	}
}
