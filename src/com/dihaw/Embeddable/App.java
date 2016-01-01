package com.dihaw.Embeddable;

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

		Address homeAddress = new Address();
		homeAddress.setCity("city home");
		homeAddress.setPinCode("pinCode home");
		homeAddress.setState("state home");
		homeAddress.setStreet("street home");
	
		Address officeAddress = new Address();
		officeAddress.setCity("city office");
		officeAddress.setPinCode("pinCode office");
		officeAddress.setState("state office");
		officeAddress.setStreet("street office");
		
		UserDetailsEmbed user = new UserDetailsEmbed();
		user.setUserName("user 1");
		user.setCreationDate(new Date());
		user.setHomeAddress(homeAddress);
		user.setOfficeAddress(officeAddress);
		
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
	
	}

}
