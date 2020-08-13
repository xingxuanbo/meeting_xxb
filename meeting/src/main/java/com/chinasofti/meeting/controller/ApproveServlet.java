package com.chinasofti.meeting.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.meeting.dao.PageDao;
import com.chinasofti.meeting.vo.Employee;

public class ApproveServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer employeeid = Integer.parseInt(request.getParameter("employeeid"));
		String oper = request.getParameter("oper");
		//System.out.println(employeeid);
		//System.out.println(oper);
		if("yes".equals(oper)) {
			//如果通过审核 
			PageDao.updateStatus(employeeid,"1");
			//如何转发页面；
			//获取当前页
			String currentPageNo = request.getParameter("currentPageNo");
			int pageNo = 1;
			
			if(currentPageNo != null) {
				pageNo = Integer.parseInt(currentPageNo);
			}
			
			//获取当前页面信息
			ArrayList<Employee> empList = PageDao.getEmpsList(pageNo);
			//将页面信息，总页数，当前页数 存储到request中。
			request.setAttribute("empList", empList);
			request.setAttribute("currentpageNo", pageNo);
			request.setAttribute("totalPage", PageDao.getTotalPage());
			request.getRequestDispatcher("approveaccount_fy.jsp").forward(request, response);
		}
		//注册审批-审核未通过
		else if("no".equals(oper)) {
			PageDao.updateStatus(employeeid, "2");
			String currentPageNo=request.getParameter("currentPageNo");
			int pageNo=2;
			if(currentPageNo!=null) {
				pageNo=Integer.parseInt(currentPageNo);
			}
			
			ArrayList<Employee> empList=PageDao.getEmpsList(pageNo);
			request.setAttribute("empList", empList);
			request.setAttribute("currentpageNo", pageNo);
			request.setAttribute("totalPage", PageDao.getTotalPage());
			request.getRequestDispatcher("approveaccount_fy.jsp").forward(request, response);
		}
		
	}

	

}
