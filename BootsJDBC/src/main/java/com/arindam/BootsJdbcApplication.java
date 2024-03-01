package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootsJdbcApplication implements CommandLineRunner {
	@Autowired
JdbcTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(BootsJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into accounts values('103','SUDIP',25000.00)";
		String select_sql="select * from accounts";
		int n=template.update(sql);
		System.out.println("THE NUMBER OF ROWS EFFECTED:"+n);
		List aclist=template.queryForList(select_sql);
		aclist.stream().forEach(System.out::println);
	}

}
