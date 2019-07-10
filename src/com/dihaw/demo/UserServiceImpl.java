package com.dihaw.demo;

import org.hibernate.Session;

public class UserServiceImpl implements IUserService {
	
	@Override
	public Long save(UserEntity entity) {
		Session session = SessionFactoryHelper.getSession();
		return (Long) session.save(entity);
	}

	@Override
	public UserEntity get(Long id) {
		Session session = SessionFactoryHelper.getSession();
		return (UserEntity) session.get(UserEntity.class, id);
	}
	
	@Override
	public UserEntity load(Long id) {
		Session session = SessionFactoryHelper.getSession();
		return (UserEntity) session.load(UserEntity.class, id);
	}

}
