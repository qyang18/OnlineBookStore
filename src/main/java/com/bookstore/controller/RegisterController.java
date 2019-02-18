package com.bookstore.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class RegisterController {
	
	 Logger log=LoggerFactory.getLogger(com.bookstore.controller.RegisterController.class);
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private UserListBean userList;
	
	@RequestMapping(value = "/register", method = { RequestMethod.GET })
	public String qlcodeCreateWeb3(@RequestParam("registerusername") String user) {
		Map<String, String> map = userList.getMap();
		if (map.containsKey(user)) {
			return "already used";
		} else {
			map.put(user, "0");
			return "register success";
		}
	}

	@PostMapping("/registerWithForm")
	public String formRegister(@ModelAttribute UserBean user) {
		Map<String, String> map = userList.getMap();
		if (map.containsKey(user.getUserID())) {
			return "already used";
		} else {
			map.put(user.getUserID(), user.getPassword());
			// log.error("register success\n UserID=" + user.getUserID() + "\n Password=" + user.getPassword());
			return "UserView";
		}
	}
}
