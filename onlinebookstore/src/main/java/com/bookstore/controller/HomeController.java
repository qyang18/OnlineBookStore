package com.bookstore.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.beans.UserBean;
import com.bookstore.beans.UserListBean;

@RestController
public class HomeController {
	Logger log=Logger.getLogger(com.bookstore.controller.HomeController.class);
			
	@Autowired
	private ApplicationContext context;
	
	@RequestMapping("/index")
	public String index()
	{
		return "UserView";
	}
	@RequestMapping("/abc")
	public String home()
	{
		return "this is a message from home controller";
	}
	
	@RequestMapping(value="/qlcode/calc", method= {RequestMethod.GET})
	public int calc(int a,int b)
	{
		return a*b;
	}
	@RequestMapping("/qlcode")
	public String qlcodeCalc()
	{
		return "BrokenDawn";
	}
	@RequestMapping(value="/register",method= {RequestMethod.GET})
	public String qlcodeCreateWeb3(@RequestParam("registerusername") String user)
	{
			UserListBean userList=context.getBean(UserListBean.class);
			Map<String,String> map=userList.getMap();
			if (map.containsKey(user))
			{
				return "already used";
			}else
			{
				map.put(user,"0");
				return "register success";
			}
	}
	@PostMapping("/registerWithForm")
	public String formRegister(@ModelAttribute UserBean user)
	{
			UserListBean userList=context.getBean(UserListBean.class);
			Map<String,String> map=userList.getMap();
			if (map.containsKey(user.getUserID()))
			{
				return "already used";
			}else
			{
				map.put(user.getUserID(),user.getPassword());
				log.error("register success\n UserID="+user.getUserID()+"\n Password="+user.getPassword());
				return "UserView";
			}
	}
}
