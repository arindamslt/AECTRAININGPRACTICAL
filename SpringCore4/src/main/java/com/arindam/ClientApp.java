package com.arindam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
//Employee empl=(Employee)ac.getBean("emp");
//System.out.println(empl);
Category cgs=(Category)ac.getBean("cg");
System.out.println(cgs);
	}

}
