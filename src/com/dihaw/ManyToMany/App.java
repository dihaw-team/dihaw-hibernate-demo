package com.dihaw.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {
		UserDetailsMTM user = new UserDetailsMTM();
		user.setUserName("user 2");
		
		VehiculeMTM vehicule1 = new VehiculeMTM();
		vehicule1.setVehiculeName("car 1");
		
		VehiculeMTM vehicule2 = new VehiculeMTM();
		vehicule2.setVehiculeName("car 2");
		
		user.getVehiculeList().add(vehicule1);
		user.getVehiculeList().add(vehicule2);
		vehicule1.getUserList().add(user);
		vehicule2.getUserList().add(user);
		
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
