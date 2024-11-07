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
		Transaction t=s.beginTransaction();
		
//		Student stud1=new Student();
//		stud1.setSid(101); stud1.setSname("Akash"); stud1.setSage(19); stud1.setSaddress("Bhopal");
//		Student stud2=new Student();
//		stud2.setSid(102); stud2.setSname("Vimal"); stud2.setSage(21); stud2.setSaddress("Delhi");
//		Student stud3=new Student();
//		stud3.setSid(103); stud3.setSname("Aman"); stud3.setSage(20); stud3.setSaddress("Jabalpur");
//
//		s.save(stud1);
//		s.save(stud2);
//		s.save(stud3);
		
		// through resultset
		
//		String hql = "from Student";
//		Query q = s.createQuery(hql);
//		List<Student> studlist =  q.getResultList();
//		
//		for(Student st :studlist)
//		{
//		   	System.out.println(st.getSid());
//		   	System.out.println(st.getSname());
//		   	System.out.println(st.getSage());
//		   	System.out.println(st.getSaddress());
//		   	System.out.println();  	
//		}
//		t.commit();
//		s.close();
		
//		String hql="from Student stud where stud.sid=:k";
//     Query q=s.createQuery(hql);
//     q.setParameter("k", 101);
//     List<Student> studlist =  q.getResultList();
//     
//     for(Student st :studlist)
//     {
//	   	System.out.println(st.getSid());
//		   	System.out.println(st.getSname());
//		   	System.out.println(st.getSage());
//		   	System.out.println(st.getSaddress());
//		   	System.out.println();  	
//		}
//		String hql=" delete from Student where sid=:i";
//        Query q=s.createQuery(hql);
//	     q.setParameter("i", 102);
//	     int del=q.executeUpdate();
//	     System.out.println(del+ " record deleted ");
	
		//delete whole records
		String hql=" delete from Student";
        Query q=s.createQuery(hql);
	     int del=q.executeUpdate();
	     System.out.println(del+ " record deleted ");
		t.commit();
		s.close();
	}

}
