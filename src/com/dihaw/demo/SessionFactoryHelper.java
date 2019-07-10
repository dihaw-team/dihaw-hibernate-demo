package com.dihaw.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	
	private static final Session session;

    static {
    	try {
        	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    		session = sessionFactory.openSession();
    		session.beginTransaction();
        } catch (Throwable e) {
            System.err.println("Error in creating Session: " + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static Session getSession() {
    	session.beginTransaction();
        return session;
    }
}
