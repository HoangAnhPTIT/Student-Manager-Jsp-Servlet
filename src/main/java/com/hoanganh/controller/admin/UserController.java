package com.hoanganh.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hoanganh.model.UserModel;
import com.hoanganh.service.IUserService;

@WebServlet(urlPatterns = { "/quan-tri-list", "/quan-tri-edit-user" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IUserService userService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		String typeUser = request.getParameter("typeUser");
		if (type.equals("list")) {		
			UserModel userModel = new UserModel();
			if (typeUser.equals("student")) {
				userModel.setListUser(userService.findAll(typeUser));
			} else if (typeUser.equals("teacher")) {
				userModel.setListUser(userService.findAll(typeUser));
			}
			request.setAttribute("model", userModel);
			RequestDispatcher rd = request.getRequestDispatcher("views/admin/user/list.jsp");
			rd.forward(request, response);
		} else if(type.equals("edit")) {
			if(typeUser.equals("student")) {
				RequestDispatcher rd = request.getRequestDispatcher("views/admin/user/editStudent.jsp");
				rd.forward(request, response);
			} else if(typeUser.equals("teacher")) {
				RequestDispatcher rd = request.getRequestDispatcher("views/admin/user/editTeacher.jsp");
				rd.forward(request, response);
			}
				
			
			
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
