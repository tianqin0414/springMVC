package com.tgb.web.controller.dao;

import java.util.List;

import com.tgb.web.controller.entity.User;

public interface IUserDAO {

	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public boolean delUser(String id);
}
