package com.bookstore.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.beans.UserBean;
import com.bookstore.beans.UserListBean;

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
