package com.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
//@ComponentScan(basePackages = { "com.bookstore" })
public class BeansConfiguration {
	@Bean
	public List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(789);
		return list;
	}
}
