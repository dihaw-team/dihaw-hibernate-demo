package com.dihaw.ElementCollection;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * @author Wahid Gazzah
 *
 */
public class App {

	public static void main(String[] args) {

		Address address1 = new Address();
		address1.setCity("city 1");
		address1.setPinCode("4070");
		address1.setState("state 1");
		address1.setStreet("street 1");
	
		Address address2 = new Address();
		address2.setCity("city 2");
		address2.setPinCode("4070");
		address2.setState("state 2");
		address2.setStreet("street 2");
	
		UserDetailsEC user = new UserDetailsEC();
		user.setUserName("user 1");
		user.setCreationDate(new Date());
		
		user.getAddressList().add(address1);
		user.getAddressList().add(address2);
		
		// .configure() is the DEFAULT location of the DEFAULT hibernate.cfg.xml name
		// if the hibernate conf file have a different name or different location (src), 
		// it should be setted on .configure() like:
		// .configure("other/path/hibernate.cfg.xml")
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetailsEC) session.get(UserDetailsEC.class, 1);
		System.out.println("---user name: "+user.getUserName());
		
		session.close();
		
		/**		the ElementCollection annotation should have a FetchType.EAGER 
				in order to get the user.addressList after closing the session		*/
		
		System.out.println("---user address list size: "+user.getAddressList().size());
	}

}
