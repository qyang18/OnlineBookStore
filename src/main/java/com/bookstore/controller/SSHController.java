package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SSHController {
	@RequestMapping(value="/ssh", method= {RequestMethod.GET})
	public String getCommand(@RequestParam(value="command",defaultValue="cd") String command)
//	public String getCommand(@PathVariable(value="command") String command)
	{
		System.out.println("data:"+command);
		return "SSHWeb.html";
	}
	
//	public List<UserInfo> getCommand()
//	{
////		System.out.println("data:"+name);
//		return UserInfoStub.getList();
//	}
}
