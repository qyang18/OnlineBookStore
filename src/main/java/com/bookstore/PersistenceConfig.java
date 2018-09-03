package com.bookstore;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
//	@Bean
//	@ConfigurationProperties(prefix = "datasource.flyway")
//	public DataSource inMemoryDataSource() {
//		return DataSourceBuilder.create().build();
//	}
}
