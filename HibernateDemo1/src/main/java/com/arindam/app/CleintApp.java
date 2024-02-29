package com.arindam.app;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.arindam.entity.Customer;
import com.arindam.entity.Employee;
import com.arindam.entity.Product;

public class CleintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityTransaction tx=null;
//LOADING DRIVER ESTABLISH THE CONNECTION CREATE STATEMENT PREPARESTATEMENT
EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
EntityManager em=emf.createEntityManager();//INSERT UPDATE DELETE OPERATIONS
tx=em.getTransaction();//transaction created
tx.begin();//transaction begins
/*Customer cs1=new Customer("C1","ALOKE","22222");
em.persist(cs1);
tx.commit();*/
/*Employee emp1=new Employee();
emp1.setEname("ROBIN");
emp1.setEdesig("MANAGER");
emp1.setJoindt(new Date());
emp1.setWorkhr(new Date());
emp1.setEmail("rb@gmail.com");
emp1.setSal(50000.00);
Employee emp2=new Employee();
emp2.setEname("AYAN");
emp2.setEdesig("MANAGER");
emp2.setJoindt(new Date());
emp2.setWorkhr(new Date());
emp2.setEmail("ay@gmail.com");
emp2.setSal(75000.00);
em.persist(emp1);
em.persist(emp2);
tx.commit();*/
System.out.println("CRUD OPERATION=========");
/*System.out.println("INSERT DATA");
Product p1=new Product("P1","TV",5,25000.00);
Product p2=new Product("P2","TAB",6,18000.00);
Product p3=new Product("P3","MOBILE",12,12000.00);
Product p4=new Product("P4","TV",15,32000.00);
em.persist(p1);
em.persist(p2);
em.persist(p3);
em.persist(p4);
tx.commit();*/
System.out.println("FETCHING DATA");
String jpql="select p from Product p";

Query query=em.createQuery(jpql);
List<Product> plist=query.getResultList();
plist.stream().forEach(System.out::println);

System.out.println("DELETE DATA");
Product ps=em.find(Product.class,"P4");
if(ps!=null)
{
	em.remove(ps);
}
Query query1=em.createQuery(jpql);
List<Product> plist1=query1.getResultList();
plist1.stream().forEach(System.out::println);
System.out.println("UPDATE DATA=========");
Product psd=em.find(Product.class,"P3");
if(psd!=null)
{
	psd.setPname("CONVECTION");
	psd.setPqty(4);
	psd.setPrice(8000.00);
}

Query query2=em.createQuery(jpql);
List<Product> plist2=query2.getResultList();
plist2.stream().forEach(System.out::println);

System.out.println("PRICE GREATER THAN 18000");
String jpql1=" from Product p where p.price>:v_price";
Query query3=em.createQuery(jpql1);
query3.setParameter("v_price",18000.00);
List<Product> plist3=query3.getResultList();
plist3.stream().forEach(System.out::println);
	}

}
