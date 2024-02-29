package com.arindam;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityTransaction tx=null;
//create jdbc cofiguration by reading persistance.xml in META-INF Folder
EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
//create update delete table
EntityManager em=emf.createEntityManager();
tx=em.getTransaction();//TRANSACTION CREATED
tx.begin();//TRANSACTION STARTED
//Customer cs=new Customer("C1","AYAN","4343443");
//em.persist(cs);//table created and data inserted
/*Employee emp1=new Employee();
Employee emp2=new Employee();
emp1.setEname("ARUP");
emp1.setEsdesig("MANAGER");
emp1.setJoindt(new Date());
emp1.setWorkhr(new Date());
emp1.setSal(50000.00);
emp1.setEmail("ar@gmail.com");
emp2.setEname("ARUPA");
emp2.setEsdesig("EXECUTIVE");
emp2.setJoindt(new Date());
emp2.setWorkhr(new Date());
emp2.setSal(40000.00);
emp2.setEmail("arp@gmail.com");
em.persist(emp1);
em.persist(emp2);*/
/*System.out.println("CRUD OPERATION");
System.out.println("INSERTING THE DATA");
Product p1=new Product("P1","TV",5,25000.00);
Product p2=new Product("P2","REFRIGERATOR",6,27000.00);
Product p3=new Product("P3","TAB",12,18000.00);
Product p4=new Product("P4","TV",15,32000.00);
Product p5=new Product("P5","CONVECTION",2,22000.00);
Product p6=new Product("P6","LAPTOP",5,45000.00);
/*em.persist(p1);
em.persist(p2);
em.persist(p3);
em.persist(p4);
em.persist(p5);
em.persist(p6);*/
System.out.println("DELETING DATA");
/*Product pst=em.find(Product.class,"P6");//select * from product where pid='p6';
if(pst!=null)
{
	em.remove(pst);//delete from product where pid ='P6';
}*/
/*System.out.println("UPDATE DATA============");
Product pst=em.find(Product.class,"P5");//select * from product where pid='p6';
if(pst!=null)
{
	pst.setPname("MOBILE");
	pst.setPqty(16);
	pst.setPrice(12000.00);
	em.persist(pst);
}*/
/*System.out.println("FETCHING DATA FROM DATABASE");
String jpql="select p from Product p";
Query query=em.createQuery(jpql);
List<Product> plist=query.getResultList();
plist.stream().forEach(System.out::println);*/
Teacher tr1=new Teacher("T1","RAMAN SIR");
Teacher tr2=new Teacher("T2","ALOKE SIR");
Student sd1=new Student(1,"AYAN",tr1);
Student sd2=new Student(2,"RUPAM",tr2);
em.persist(tr1);
em.persist(tr2);
em.persist(sd1);
em.persist(sd2);
tx.commit();//save data
emf.close();//close the entity manager factory
	}

}
