package com.bookstore.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class UserListBean {
	private Map<String,String> map;
	public UserListBean()
	{
		map=new HashMap<String,String>();
	}
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
}
