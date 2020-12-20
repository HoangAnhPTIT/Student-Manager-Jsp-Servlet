package com.hoanganh.DAO;

import java.util.List;

import com.hoanganh.model.UserModel;

public interface IUserDAO {
	List<UserModel> findAll(String type);
	UserModel findByUserNameAndPassword(String userName, String password);
	Long save(UserModel userModel);
}
