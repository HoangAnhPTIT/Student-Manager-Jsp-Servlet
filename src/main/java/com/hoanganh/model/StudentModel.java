package com.hoanganh.model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
	private Long id;
	private int svNam;
	private UserModel userModel;
	private List<StudentModel> listUser = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSvNam() {
		return svNam;
	}

	public void setSvNam(int svNam) {
		this.svNam = svNam;
	}

	public List<StudentModel> getListUser() {
		return listUser;
	}

	public void setListUser(List<StudentModel> listUser) {
		this.listUser = listUser;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
