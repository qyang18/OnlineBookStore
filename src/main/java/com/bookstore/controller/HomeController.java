package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//Logger log=Logger.getLogger(com.bookstore.controller.HomeController.class);
			
	@Autowired
	private ApplicationContext context;

	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
}
