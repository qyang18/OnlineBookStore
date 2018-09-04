package com.bookstore.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;
import com.bookstore.entity.Customer;
import com.bookstore.repository.AuthorRepo;
import com.bookstore.repository.BookRepo;
import com.bookstore.repository.CustomerRepo;

//@RestController
@Controller
public class JPAController {
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private AuthorRepo authorRepo;

	@ResponseBody
	@RequestMapping("/addCustomer")
	public String addCustomer(@RequestParam("first") String firstName, @RequestParam("last") String lastName) {
		Customer c1 = new Customer(firstName, lastName);
//		customerRepo.save(c1);
		customerRepo.saveAndFlush(c1);
		return "save customer successed";
	}

	@ResponseBody
	@RequestMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> list = customerRepo.findAll();
		return list;
	}

	@ResponseBody
	@RequestMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerRepo.findOne(id);
	}

	@ResponseBody
	@RequestMapping("/getCustomerByFirstName/{firstName}")
	public Customer getCustomerByFirstName(@PathVariable("firstName") String ming) {
		return customerRepo.findCustomerByFirstName(ming);
	}

	@ResponseBody
	@RequestMapping("/testCascade")
	public void testCascade() {
		Set<Author> set = new HashSet<Author>();
		set.add(new Author("Qi", "Yang"));
		set.add(new Author("Yuchen", "Lu"));
		Book book = new Book("ISBN1", "Three Body", 35L, set);
		
		//non cascade CRUD operation:
//		for (Author author : set) {
//			authorRepo.save(author);
//		}
//		bookRepo.save(book);
		
		//cascade CRUD operation:
		bookRepo.save(book);
	}
	
	@ResponseBody
	@RequestMapping("/testFetch")
	public Set<Author> testFetch() {		
		Book book = bookRepo.findOne(1L);
		Set<Author> set = book.getAuthors();
		return set;
	}

}
