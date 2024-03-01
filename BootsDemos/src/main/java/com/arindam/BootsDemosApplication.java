package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BootsDemosApplication  implements CommandLineRunner {
    @Autowired
	DbConn db;
    @Autowired
    Environment env;
	public static void main(String[] args) {
		SpringApplication.run(BootsDemosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println(db);	
	System.out.println(env.getProperty("website"));
	System.out.println(env.getProperty("database"));
	}

}
