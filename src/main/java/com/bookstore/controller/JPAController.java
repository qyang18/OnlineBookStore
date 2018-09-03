package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookstore.entity.Book;
import com.bookstore.entity.Customer;
import com.bookstore.repository.CustomerRepo;

//@RestController
@Controller
public class JPAController {
	@Autowired
	private CustomerRepo customerRepo;
	
	@ResponseBody
	@RequestMapping("/addCustomer")
	public String addCustomer(@RequestParam("first") String firstName, @RequestParam("last") String lastName)
	{
		Customer c1=new Customer(firstName, lastName);
//		customerRepo.save(c1);
		customerRepo.saveAndFlush(c1);
		return "save customer successed";
	}
	
	@ResponseBody
	@RequestMapping("/getAllCustomers")
	public List<Customer>  getAllCustomers()
	{
		List<Customer> list=customerRepo.findAll();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/getCustomer/{id}")
	public Customer  getCustomer(@PathVariable Long id)
	{
		return customerRepo.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping("/getCustomerByFirstName/{firstName}")
	public Customer getCustomerByFirstName(@PathVariable("firstName") String ming)
	{
		return customerRepo.getCustomerByFirstName(ming);
	}
	
}
