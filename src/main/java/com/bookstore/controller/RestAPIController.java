package com.bookstore.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.beans.BookBean;
import com.bookstore.beans.aaData;

@RestController
public class RestAPIController {
	@RequestMapping("/book.json")
	public BookBean getBookInfo() {
		aaData aaData = new aaData("Pride and Prejudice", Arrays.asList("Jane Austin"), "C. Scribner's sons", "1918", 4,
				"en", 1);
		BookBean book = new BookBean("books#volume", "s1gVAAAAYAAJ", aaData, 1);
		return book;
	}
}
