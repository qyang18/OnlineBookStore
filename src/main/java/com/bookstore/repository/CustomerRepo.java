package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	public Customer findCustomerByFirstName(String firstName);
	
}
