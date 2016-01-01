package com.dihaw.inheritance1.withSingleTableStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {

		Vehicule_ST vehicule = new Vehicule_ST();
		vehicule.setVehiculeName("car 1");
		
		TwoWheeler_ST bike = new TwoWheeler_ST();
		bike.setVehiculeName("Bike");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler_ST car = new FourWheeler_ST();
		car.setVehiculeName("Porshe");
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
