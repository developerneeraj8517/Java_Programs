

// ENtity Class
package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}



//         MAIN CLASS
package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Demo1 {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();   //configure
		cf.configure("hibernate.cfg.xml")
		;
         SessionFactory sf=cf.buildSessionFactory();   //build session
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();      //transaction
		
		Employee e1=new Employee();              // insert into emplohyee
		e1.setEid(101); e1.setEname("Rohan"); e1.setSalary(21230);
		Employee e2=new Employee();
		e1.setEid(102); e1.setEname("Ramda"); e1.setSalary(25000);
		Employee e3=new Employee();
		e1.setEid(103); e1.setEname("Mohit"); e1.setSalary(20000);
		
		s.save(e1);
		s.save(e2);      // save the transaction
		s.save(e3);
		
		String hql="From EmpTable";
		Query q = s.createQuery(hql);
		  
		// cretae list of employee
		List<Employee> empList=q.getResultList();
		
		for(Employee emp:empList) {            
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getSalary());
		}
		
		t.commit();
		s.close();
		
		

	}

}
