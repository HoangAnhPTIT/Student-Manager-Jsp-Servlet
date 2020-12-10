package com.hoanganh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hoanganh.model.RoleModel;
import com.hoanganh.model.StudentModel;
import com.hoanganh.model.TeacherModel;
import com.hoanganh.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel rowMapper(ResultSet result) {
		try {
			UserModel model = new UserModel();
			model.setId(result.getLong("id"));
			model.setAddress(result.getString("address"));
			model.setAge(result.getInt("age"));
			model.setFullName(result.getString("fullname"));
			model.setGender(result.getString("gender"));
			model.setUserCode(result.getString("user_code"));
			model.setUserName(result.getString("username"));
			model.setPassword(result.getString("password"));
			String type = result.getString("user_code");
			try {
				RoleModel role = new RoleModel();
				role.setCode(result.getString("code"));
				role.setName(result.getString("name"));
				model.setRoleModel(role);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			if (type.equals("student")) {
				try {
					StudentModel studentModel = new StudentModel();
					studentModel.setSvNam(result.getInt("svnam"));
					model.setStudentModel(studentModel);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (type.equals("teacher")) {
				try {
					TeacherModel teacherModel = new TeacherModel();
					teacherModel.setThamNien(result.getInt("thamnien"));
					model.setTeacherModel(teacherModel);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return model;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
