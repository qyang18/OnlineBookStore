package com.bookstore;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { PersistenceConfig.class, BeansConfiguration.class })
//@ContextConfiguration(classes = { BeansConfiguration.class })
@RunWith(SpringRunner.class)
@SpringBootTest
public class test2 {

	@Autowired
	List<Integer> list;

	@Test
	public void testBeanList() {
		int zero = list.get(0);
		Assert.assertEquals(789L, (long) zero);
	}

}
