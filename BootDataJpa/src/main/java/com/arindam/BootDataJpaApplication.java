package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Purchase;
import com.arindam.service.PurchaseService;

@SpringBootApplication
public class BootDataJpaApplication implements CommandLineRunner{
	@Autowired
PurchaseService pservice;
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Purchase pr=new Purchase("I1","TV",5,25000.00);
		Purchase pr1=new Purchase("I2","REFRIGERATOR",6,27000.00);
		//pservice.addData(pr);
		//pservice.addData(pr1);
		System.out.println("DELETE DATA======");
		//pservice.deleteData("I2");
		System.out.println("UPDATE DATA============");
		Purchase pst=new Purchase();
		pst.setIname("TAB");
		pst.setIqty(15);
		pst.setPrice(18000.00);
		pservice.updateData("I1", pst);
		System.out.println("FETCHING DATA======");
		List<Purchase> plist=pservice.getData();
		plist.stream().forEach(System.out::println);
	}

}
