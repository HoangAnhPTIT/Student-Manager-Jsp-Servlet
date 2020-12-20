package com.hoanganh.api;

import com.hoanganh.model.StudentModel;
import com.hoanganh.model.TeacherModel;
import com.hoanganh.model.UserModel;
import com.hoanganh.service.IStudentService;
import com.hoanganh.service.ITeacherService;
import com.hoanganh.service.IUserService;
import com.hoanganh.utils.FormUtil;
import com.hoanganh.utils.HttpUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/user-api"})
public class UserApi extends HttpServlet{
    @Inject
    private IUserService userService;

    @Inject
    private IStudentService studentService;

    @Inject
    private ITeacherService teacherService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserModel userModel = HttpUtil.of(req.getReader()).toModel(UserModel.class);
        Long id = userService.save(userModel);
        String userCode = userModel.getUserCode();
        if(userCode.equals("student")){
            StudentModel studentModel = new StudentModel();
            studentModel.setSvNam(userModel.getSvNam());
            studentModel.setId(id);
            studentService.save(studentModel);
        } else if(userCode.equals("teacher")){
            TeacherModel teacherModel = new TeacherModel();
            teacherModel.setId(id);
            teacherModel.setThamNien(userModel.getThamNien());
            teacherService.save(teacherModel);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
