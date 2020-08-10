package com.chinasofti.meeting.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.chinasofti.meeting.dao.EmployeeDao;
import com.chinasofti.meeting.vo.Employee;


public class ValidateUsernameServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("username");
		boolean flag=true;//可以使用用户名
		String message="";
		EmployeeDao dao=new EmployeeDao();
		Employee user=dao.selectByUserName(username);
		if(user==null) {
			message="用户名可以使用";
		}else {
			flag=false;
			message="用户已存在，请重新选择用户名";
		}
		//System.out.println("flag=="+flag+",message=="+message);
		//xml  <?xml version="1.0" encoding="UTF-8"?>
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		response.setHeader("Cache-Control", "on-cache");
		out.println("<?xml version='1.0' encoding='UTF-8'?>");
		out.println("<response>");
		out.println("<passed>"+Boolean.toString(flag)+"</passed>");
		out.println("<message>"+message+"</message>");
		out.println("</response>");
		out.close();
	}

}
