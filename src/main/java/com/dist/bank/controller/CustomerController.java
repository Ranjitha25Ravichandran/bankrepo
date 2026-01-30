package com.dist.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dist.bank.entity.Customer;
import com.dist.bank.service.CustomerService;

@RestController
@RequestMapping("/customers-api/v1")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/{custId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Long custId) {
		Customer customer = customerService.getCustomer(custId);
		return ResponseEntity.ok(customer);
	}

	@PostMapping
	public void createCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

	@DeleteMapping("/{custId}")
	public void deleteCustomer(@PathVariable Long custId) {
		customerService.deleteCustomer(custId);
	}

}
