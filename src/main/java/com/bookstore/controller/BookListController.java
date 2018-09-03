package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookListController {
	@RequestMapping("/List")
	public String getBookList()
	{
		return "viewInfo";
	}
	
	@RequestMapping("/book")
	public String getBook()
	{
		return "viewGoogleBookList";
	}

	@RequestMapping("/sampleDataTable")
	public String getSampleDataTable()
	{
		return "SampleDataTable";
	}
}
