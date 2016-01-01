package com.dihaw.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {

		UserDetailsMTO user = new UserDetailsMTO();
		user.setUserName("user 1");
		
		VehiculeMTO vehicule1 = new VehiculeMTO();
		vehicule1.setVehiculeName("car 1");
		
		VehiculeMTO vehicule2 = new VehiculeMTO();
		vehicule2.setVehiculeName("car 2");
		
		user.getVehicules().add(vehicule1);
		user.getVehicules().add(vehicule2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(vehicule1);
		session.save(vehicule2);
		
		session.getTransaction().commit();
		session.close();
	
	}

}
