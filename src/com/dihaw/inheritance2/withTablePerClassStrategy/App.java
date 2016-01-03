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

		Vehicule_TPC vehicule = new Vehicule_TPC();
		vehicule.setVehiculeName("car 1");
		
		TwoWheeler_TPC bike = new TwoWheeler_TPC();
		bike.setVehiculeName("Bike 1");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler_TPC car = new FourWheeler_TPC();
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
