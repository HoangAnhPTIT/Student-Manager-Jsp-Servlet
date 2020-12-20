package com.hoanganh.service.impl;

import com.hoanganh.DAO.ITeacherDAO;
import com.hoanganh.model.TeacherModel;
import com.hoanganh.service.ITeacherService;

import javax.inject.Inject;

public class TeacherService implements ITeacherService {
    @Inject
    private ITeacherDAO teacherDAO;

    @Override
    public void save(TeacherModel teacherModel) {
        teacherDAO.save(teacherModel);
    }
}
