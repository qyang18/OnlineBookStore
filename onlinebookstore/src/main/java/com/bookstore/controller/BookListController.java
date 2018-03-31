package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {
	@RequestMapping("/bookList")
	public String getBookList()
	{
		//DAO get data->list
		//pass to model
		return "viewBookList";
	}
}
