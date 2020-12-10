package com.hoanganh.DAO.impl;

import java.util.List;

import com.hoanganh.DAO.IUserDAO;
import com.hoanganh.mapper.UserMapper;
import com.hoanganh.model.UserModel;

public class UserDAO extends AbstractDAO implements IUserDAO {

	@Override
	public List<UserModel> findAll(String type) {
		String sql = "";
		if(type.equals("student")) {
			sql = "SELECT * FROM user INNER JOIN student ON student.user_id=user.id";
		} else if(type.equals("teacher")) {
			sql = "SELECT * FROM user INNER JOIN teacher ON teacher.user_id=user.id";
		}
		
		return query(sql, new UserMapper());
		
	}

	@Override
	public UserModel findByUserNameAndPassword(String userName, String password) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user INNER JOIN role ON user.role_id=role.id ");
		sql.append("WHERE username=? AND password=?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password);
		return users.isEmpty() ? null : users.get(0);
	}

}
