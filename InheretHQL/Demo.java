package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Demo {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf=c.buildSessionFactory();
        Session s=sf.openSession();
       Transaction t = s.beginTransaction();
       
       Vehicle v=new Vehicle();
       v.setId(101l);
       
       Car c1=new Car();
       c1.setCarName("Maruti");
       
       Bike b=new Bike();
       b.setBikeName("Pulsar");
       
       s.save(v);
       s.save(c1);
       s.save(b);
	    
       String hql="FROM Vehicle";
       Query q=s.createQuery(hql);
       
       List<Vehicle> vehicle=q.list();
       
//	for(Vehicle v1:vehicle) {
//    	   System.out.println();
//       }
       
   	for(Vehicle v1:vehicle)
	{
		System.out.println("Vehicle ID : "+v1.getId());
	}
       
	    t.commit();
	    s.close();
	}

}
