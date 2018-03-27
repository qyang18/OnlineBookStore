package com.brokendawn.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brokendawn.model.UserInfo;

@Configuration
public class testBeans {
	@Bean  
    public UserInfo UserBean() {
		return new UserInfo("qyang18","123","QiYang","3001 S King Dr", 25);  
    }
}
