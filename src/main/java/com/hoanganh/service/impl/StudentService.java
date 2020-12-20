package com.hoanganh.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.hoanganh.DAO.IStudentDAO;
import com.hoanganh.model.StudentModel;
import com.hoanganh.service.IStudentService;

public class StudentService implements IStudentService{
	
	@Inject
	private IStudentDAO studentDAO;
	
	@Override
	public List<StudentModel> findAll() {
		return studentDAO.findAll();
	}

	@Override
	public void save(StudentModel studentModel) {
		studentDAO.save(studentModel);
	}

}
