package com.arindam.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Customer;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
ac.scan("com.arindam");
ac.refresh();
Customer cs=(Customer)ac.getBean("customer");
System.out.println(cs);
	}

}
