package com.hoanganh.DAO.impl;

import com.hoanganh.DAO.ITeacherDAO;
import com.hoanganh.model.TeacherModel;

public class TeacherDAO extends AbstractDAO implements ITeacherDAO {
    @Override
    public void save(TeacherModel teacherModel) {
        String sql = "INSERT INTO teacher (user_id, thamnien) VALUES(?, ?)";
        Long id = save(sql, teacherModel.getId(), teacherModel.getThamNien());
    }
}
