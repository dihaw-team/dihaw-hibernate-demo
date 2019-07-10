package com.dihaw.demo;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		
		IUserService UserService = new UserServiceImpl();
		
		UserEntity entity = new UserEntity();
		entity.setName("car 10");
		Long id = UserService.save(entity);

		
		UserEntity User_get = UserService.get(312L);
		if(User_get == null) {
			System.err.println("User Not Found ");
		}
		
		try {
			UserEntity User_load = UserService.load(312L);
			System.out.println(" --- User: "+User_load.getName());
		}catch (ObjectNotFoundException e) {
			System.err.println("ObjectNotFoundException: "+e.getMessage());
		}
		
		
		
		
		entity = UserService.get(id);
		
		entity.setName("car 11");
		UserService.save(entity);
		
		entity.setName("car 12");
		UserService.save(entity);
		
		
		Session session = SessionFactoryHelper.getSession();
		session.getTransaction().commit();
		session.close();
	}
	
	
	
}
