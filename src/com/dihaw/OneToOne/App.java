package com.dihaw.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {
		
		UserDetailsOTO user = new UserDetailsOTO();
		user.setUserName("user 1");
		
		VehiculeOTO vehicule = new VehiculeOTO();
		vehicule.setVehiculeName("car 1");
		vehicule.setUser(user);
		
		user.setVehicule(vehicule);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(vehicule);
		
		session.getTransaction().commit();
		session.close();
	
	}

}
