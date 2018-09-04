package com.bookstore.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.logging.log4j.Logger;
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
	public Optional<Customer> getCustomer(@PathVariable Long id) {
		return customerRepo.findById(id);
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

		// non cascade CRUD operation:
//		for (Author author : set) {
//			authorRepo.save(author);
//		}
//		bookRepo.save(book);

		// cascade CRUD operation:
		bookRepo.save(book);
	}

	@ResponseBody
	@RequestMapping("/testFetch")
	public Set<Author> testFetch() {
		Optional<Book> book = bookRepo.findById(1L);
		Set<Author> set = book.get().getAuthors();
		return set;
	}

	@ResponseBody
	@RequestMapping("/cheapBooksHQL")
	public Set<Book> cheapBooksHQL(@RequestParam("maxPrice") Long maxPrice) {
//		return bookRepo.getCheapBooks(maxPrice);
		return bookRepo.getCheapBooksHQL(maxPrice);
	}

	@ResponseBody
	@RequestMapping("/cheapBooksSQL")
	public Set<Book> cheapBooksSQL(@RequestParam("maxPrice") Long maxPrice) {
		return bookRepo.getCheapBooksSQL(maxPrice);
	}
}
