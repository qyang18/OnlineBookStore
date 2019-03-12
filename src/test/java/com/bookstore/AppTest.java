package com.bookstore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class) // Indicates that the class should use Spring's JUnit facilities
@ContextConfiguration(classes = { App.class, PersistenceConfig.class, BeansConfiguration.class }) // load application
																									// context
@WebAppConfiguration
@SpringBootTest
//@PropertySource(value = {"classpath:application.yml"})
public class AppTest {
	@Autowired
	WebApplicationContext wac;
	@Autowired
	DataSource dataSource;

	private MockMvc mockMvc;
	private JdbcTemplate jdbcTemplate;

	private MockHttpServletRequest request;
	private MockHttpServletResponse response;

	@Autowired
	List<Integer> list;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

//	@Test
//	public void testBeanList() {
//		int zero = list.get(0);
//		Assert.assertEquals(789L, (long) zero);
//	}

//	@Test
//	public void testContext() {
//		ServletContext servletContext = wac.getServletContext();
//		Assert.assertNotNull(servletContext);
//		Assert.assertTrue(servletContext instanceof MockServletContext);
//		Assert.assertNotNull(wac.getBean("BookListController"));
//	}

	@Test
	public void testBeanExists() {
		Assert.assertNotNull(wac.getServletContext());
		Assert.assertNotNull(wac.getBean("JPAController"));
		Assert.assertNotNull(dataSource);
		long ret=jdbcTemplate.queryForObject("select count(1) from users", long.class);
		Assert.assertTrue(ret>1L);
	}

	@Test
	public void testAddCustomer() throws Exception {
//		ResultMatcher ok = MockMvcResultMatchers.status().isOk();
//		ResultMatcher msg=MockMvcResultMatchers.model().attribute(name, matcher)
//		ResultMatcher retMsg = MockMvcResultMatchers.content().string("save customer successed");

//		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/addCustomer").param("first", "Qi")
//				.param("last", "Yang");
//		mockMvc.perform(builder).andExpect(ok).andExpect(retMsg);
		mockMvc.perform(get("/book.json")).andExpect(status().isOk());
	}

}
