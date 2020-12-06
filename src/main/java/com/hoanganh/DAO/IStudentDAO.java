package com.hoanganh.DAO;

import java.util.List;

import com.hoanganh.model.StudentModel;

public interface IStudentDAO {
	List<StudentModel> findAll();
}
