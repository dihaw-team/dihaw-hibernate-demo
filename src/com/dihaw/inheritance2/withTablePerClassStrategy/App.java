package com.dihaw.inheritance2.withTablePerClassStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {

		Vehicule_WTPC vehicule = new Vehicule_WTPC();
		vehicule.setVehiculeName("car 1");
		
		TwoWheeler_WTPC bike = new TwoWheeler_WTPC();
		bike.setVehiculeName("Bike 1");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler_WTPC car = new FourWheeler_WTPC();
		car.setVehiculeName("Porshe 1");
		car.setSteeringWhell("Porshe Steering Wheel");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicule);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		session.close();
	
	}

}
