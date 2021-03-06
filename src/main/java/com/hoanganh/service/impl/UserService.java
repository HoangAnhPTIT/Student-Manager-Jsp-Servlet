package com.hoanganh.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hoanganh.DAO.IUserDAO;
import com.hoanganh.model.UserModel;
import com.hoanganh.service.IUserService;

public class UserService implements IUserService{
	@Inject
	private IUserDAO userDAO;
	
	@Override
	public List<UserModel> findAll(String type) {
		return userDAO.findAll(type);
	}

	@Override
	public UserModel findByUserNameAndPassword(String userName, String password) {
		return userDAO.findByUserNameAndPassword(userName, password);
	}

	@Override
	public Long save(UserModel userModel) {
		return userDAO.save(userModel);
	}

}
