package com.bookstore;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class PersistenceConfig {
	static Logger log = LoggerFactory.getLogger(PersistenceConfig.class);

	private String url;
	private String username;
	private String password;
	private String schema;
	private String driverClassName;

//	@Bean
//	public DataSource dataSource(DataSourceProperties dataSourceProperties) {
//		log.info("SSH connect started by DataSourceConfig");
//		HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class)
//				.username(dataSourceProperties.getUsername()).password(dataSourceProperties.getPassword())
//				.url(dataSourceProperties.getUrl()).driverClassName(dataSourceProperties.getDriverClassName()).build();
//		return dataSource;
//	}
	@Bean
	public DataSource dataSource() {
		log.info("SSH connect started by DataSourceConfig");
		HikariDataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class)
				.username(username).password(password)
				.url(url).driverClassName(driverClassName).build();
		return dataSource;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

//	@Bean
//	@ConfigurationProperties(prefix = "datasource.flyway")
//	public DataSource inMemoryDataSource() {
//		return DataSourceBuilder.create().build();
//	}

}
