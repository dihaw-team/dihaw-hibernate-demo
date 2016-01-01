package com.dihaw.CascadeTypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {

		UserDetailsCT user = new UserDetailsCT();
		user.setUserName("user 1");
		
		VehiculeCT vehicule1 = new VehiculeCT();
		vehicule1.setVehiculeName("car 1");
		
		VehiculeCT vehicule2 = new VehiculeCT();
		vehicule2.setVehiculeName("car 2");
		
		user.getVehicules().add(vehicule1);
		user.getVehicules().add(vehicule2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(user);
//		session.save(user);

		session.getTransaction().commit();
		session.close();
	
	}

}
