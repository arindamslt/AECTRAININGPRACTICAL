package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication implements CommandLineRunner {
	@Autowired
Customer cs;
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
		//System.out.println("WELCOME TO SPRING BOOT");
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(cs);
	}
	

}
