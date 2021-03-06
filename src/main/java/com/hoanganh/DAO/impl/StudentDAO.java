package com.hoanganh.DAO.impl;

import java.util.List;

import com.hoanganh.DAO.IStudentDAO;
import com.hoanganh.model.StudentModel;

public class StudentDAO extends AbstractDAO implements IStudentDAO{

	@Override
	public List<StudentModel> findAll() {
		String sql = "SELECT * FROM student INNER JOIN user ON student.user_id=user.id";
//		return query(sql, new StudentMapper());
		return null;
	}

	@Override
	public void save(StudentModel studentModel) {
		String sql = "INSERT INTO student (user_id, svNam) VALUES (?, ?)";
		Long id = save(sql, studentModel.getId(), studentModel.getSvNam());
	}

}
