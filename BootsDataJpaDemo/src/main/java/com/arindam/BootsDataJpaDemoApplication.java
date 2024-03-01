package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.entity.PurchaseDetails;
import com.arindam.service.PurchaseService;

@SpringBootApplication
public class BootsDataJpaDemoApplication implements CommandLineRunner {
	@Autowired
PurchaseService pservice;
	public static void main(String[] args)  {
		SpringApplication.run(BootsDataJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		PurchaseDetails pd=new PurchaseDetails("I1","TV",5,25000.00);
		PurchaseDetails pd2=new PurchaseDetails("I2","TAB",12,18000.00);
		PurchaseDetails pd5=new PurchaseDetails("I3","MOBILE",6,12000.00);
		PurchaseDetails pd4=new PurchaseDetails("I4","LAPTOP",12,45000.00);
		//pservice.addData(pd);
		//pservice.addData(pd2);
		//pservice.addData(pd5);
		//pservice.addData(pd4);
		System.out.println("DELETE DATA");
		//pservice.deleteData("I2");
		System.out.println("UPDATE DATA=====");
		PurchaseDetails pd3=new PurchaseDetails();
		pd3.setIname("TAB");
		pd3.setIqty(2);
		pd3.setPrice(18000.00);
		//PurchaseDetails pds=pservice.updateData("I1", pd3);
		//System.out.println(pds);
		System.out.println("DISPLAY DATA");
		List<PurchaseDetails> pdlist=pservice.getData();
		//pdlist.stream().forEach(System.out::println);
		System.out.println("DATA BASED ON ITEMCODE=======");
		PurchaseDetails pdst=pservice.getItemByIcode("I1");
		System.out.println(pdst);
		List<PurchaseDetails> plists=pservice.getItemByPrice(25000.00);
		plists.stream().forEach(System.out::println);
		
	}

}
