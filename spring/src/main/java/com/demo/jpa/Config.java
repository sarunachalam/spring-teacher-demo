package com.demo.jpa;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	 @Bean(name = "datasource")
	    public DriverManagerDataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        dataSource.setUrl("jdbc:sqlserver://SAINDHAVI\\SQLEXPRESS:1433;databaseName=javademo");
	        dataSource.setUsername("sa");
	        dataSource.setPassword("saindhavi");
	        return dataSource;
	    }
	 @Bean(name="template")
	 @Autowired
	 public JdbcTemplate template(@Qualifier("datasource") DataSource dataSource) {
		 return new JdbcTemplate(dataSource);
	 }
	
	@Bean(name="connection")
	 @Autowired
	 public String getConnection(@Qualifier("template") JdbcTemplate template) {
		 
		 template.execute("Select * from teacher");
		 
		 return "";
	 }
}
