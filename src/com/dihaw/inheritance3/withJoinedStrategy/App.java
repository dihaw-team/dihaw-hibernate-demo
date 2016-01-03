package com.dihaw.inheritance3.withJoinedStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {
		
/**
		TEST: to get all the data of TwoWheelerJ, we have to do this with JOIN:
			SELECT * FROM inh_j_vehicule JOIN inh_j_two_wheeler 
			ON inh_j_vehicule.vehicule_id = inh_j_two_wheeler.vehicule_id
*/

		Vehicule_J vehicule = new Vehicule_J();
		vehicule.setVehiculeName("car 1");
		
		TwoWheeler_J bike = new TwoWheeler_J();
		bike.setVehiculeName("Bike 1");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler_J car = new FourWheeler_J();
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
