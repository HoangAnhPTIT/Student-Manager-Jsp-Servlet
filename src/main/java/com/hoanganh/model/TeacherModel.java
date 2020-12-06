package com.hoanganh.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherModel {
	private int thamNien;
	private List<UserModel> listUser = new ArrayList<>();
	public int getThamNien() {
		return thamNien;
	}

	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}

	public List<UserModel> getListUser() {
		return listUser;
	}

	public void setListUser(List<UserModel> listUser) {
		this.listUser = listUser;
	}
	
	
	
	
}
