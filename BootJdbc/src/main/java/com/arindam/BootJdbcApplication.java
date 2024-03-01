package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootJdbcApplication implements CommandLineRunner {
	@Autowired
JdbcTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(BootJdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INSERT DATA INTO ACCOUNT TABLE");
	//String sql="insert into account values('100','ANUP',15000.00)";
	String sql="insert into account values('300','AJOY',25000.00)";
	int n=template.update(sql);
	System.out.println("FETCH DATA FROM ACCOUNT TABLE");
	String select_sql="select * from account";
	List aclist=template.queryForList(select_sql);
	aclist.stream().forEach(System.out::println);
	
	
	}

}
