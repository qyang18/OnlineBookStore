package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	public Customer findCustomerByFirstName(String firstName);

}
