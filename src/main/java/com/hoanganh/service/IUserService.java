package com.hoanganh.service;

import java.util.List;

import com.hoanganh.model.UserModel;

public interface IUserService {
	List<UserModel> findAll(String type);
	UserModel findByUserNameAndPassword(String userName, String password);
	Long save(UserModel userModel);
}
