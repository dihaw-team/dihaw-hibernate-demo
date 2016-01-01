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
		TEST: to get all the data of TwoWheelerWJS, we have to do this with JOIN:
			SELECT * FROM inh_wjs_vehicule JOIN inh_wjs_two_wheeler 
			ON inh_wjs_vehicule.vehicule_id = inh_wjs_two_wheeler.vehicule_id
*/

		Vehicule_WJS vehicule = new Vehicule_WJS();
		vehicule.setVehiculeName("car 1");
		
		TwoWheeler_WJS bike = new TwoWheeler_WJS();
		bike.setVehiculeName("Bike 1");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler_WJS car = new FourWheeler_WJS();
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
