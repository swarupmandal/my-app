package com.swa.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibarnateUtil {

	public HibarnateUtil() {
		
	}
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try {
			return new Configuration().configure().buildSessionFactory();
			
		} catch (Exception e) {
			System.out.println("Initial build session factory faild..."+ e);
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}
		
		
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
