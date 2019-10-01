package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
    	Configuration c= new Configuration().configure();
		SessionFactory fac= c.buildSessionFactory();
		Session s=fac.openSession();
		Transaction t=s.beginTransaction(); 
		Product p=new Product();
		p.setProd_id(18);
		p.setName("TV");
		p.setBrand("sony");
		p.setPrice(52000);
		
		s.save(p);
		System.out.println("Product is saved");
		
		
		t.commit();
		s.close();
		System.exit(0);
		
		
    }
}
