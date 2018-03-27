//package com.brokendawn.bean;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableJpaRepositories
//@EnableTransactionManagement
//public class JPAConfig {
//		@Bean
//	  public DataSource dataSource() {
//	      ...
//	  }
//
//	  @Bean
//	  public EntityManagerFactory entityManagerFactory() {
//	      ..
//	      factory.setDataSource(dataSource());
//	      return factory.getObject();
//	  }
//
//	  @Bean
//	  public PlatformTransactionManager transactionManager() {
//	      JpaTransactionManager txManager = new JpaTransactionManager();
//	      txManager.setEntityManagerFactory(entityManagerFactory());
//	      return txManager;
//	  }
//}
