package com.dihaw.demo;

public interface IUserService {

	Long save(UserEntity entity);
	
	UserEntity get(Long id);
	
	UserEntity load(Long id);
}
