package com.home.springtest.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.home.springtest.format.Employee_1;
import com.home.springtest.format.Employee_2;
import com.home.springtest.format.Employee_3;
import com.home.springtest.format.Employee_4;
import com.home.springtest.format.Table;
import com.home.springtest.model.Employee1;
import com.home.springtest.model.Employee2;
import com.home.springtest.model.Employee3;
import com.home.springtest.model.Employee4;

public class Operations {
	
	public Table listATable(String table){
		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List employees = new ArrayList();
		List liste = new ArrayList();
		try{
			tx = session.beginTransaction();
			// table name
			Class e1 = Class.forName("com.home.springtest.model."+table);
			// Add restriction.
			Criteria cr = session.createCriteria(e1);
			// obtain all rows of the table
			employees = cr.list();
			
			for (Object o : employees){
				liste.add(switchClass(o));
			}
			
			tx.commit();
			
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			session.close();
			return new Table(table,liste);
		}
	}
	
	public Table listRangeDatesATable(String table, int day1, int month1, int year1, int day2, int month2, int year2){
		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List employees = new ArrayList();
		List liste = new ArrayList();
		try{
			tx = session.beginTransaction();
			// table name
			Class e1 = Class.forName("com.home.springtest.model."+table);
			// Add restriction.
			Criteria cr = session.createCriteria(e1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String dateString = ""+year1+"-"+month1+"-"+day1+" "+"00:00:00";
			Date date = sdf.parse(dateString);			
			cr.add(Restrictions.ge("updatedate",date));
			dateString = ""+year2+"-"+month2+"-"+(day2+1)+" "+"00:00:00";
			
			date = sdf.parse(dateString);
			cr.add(Restrictions.lt("updatedate",date));
			
			// obtain all rows of the table
			employees = cr.list();
			
			System.out.println("Size " +employees.size());
			
			for (Object o : employees){
				liste.add(switchClass(o));
			}
			
			tx.commit();
			
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			session.close();
			return new Table(table,liste);
		}
	}
	
	
	
	public Object switchClass(Object o){
		String typo = o.getClass().getSimpleName();	
		switch(typo){	   	 
		case "Employee1":
			Employee1 employee1 = (Employee1) o;
			return new Employee_1(employee1.getId(), employee1.getName(),employee1.getUpdatedate()+"");
		case "Employee2":
			Employee2 employee2 = (Employee2) o; 
			return new Employee_2(employee2.getId(), employee2.getName(),employee2.getUpdatedate()+"",employee2.getOpinion());
		case "Employee3":
       	 	Employee3 employee3 = (Employee3) o; 
			return new Employee_3(employee3.getId(), employee3.getName(),employee3.getUpdatedate()+"",employee3.getDeparture());
		case "Employee4":
       	 	Employee4 employee4 = (Employee4) o; 
			return new Employee_4(employee4.getId(), employee4.getName(),employee4.getUpdatedate()+"",employee4.getStatus(),employee4.getLevel());
		default:
			return null;
	   	}
	}
}
