package com.hoanganh.service;

import java.util.List;

import com.hoanganh.model.StudentModel;

public interface IStudentService {
	List<StudentModel> findAll();
	void save(StudentModel studentModel);
}
