package org.hibernate.tutorial.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public HibernateUtil() {
		System.out.println("SESSION_FACTORY OBJ CREATED...");
	}

	public static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	public static SessionFactory buildSessionFactory(){
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
}
