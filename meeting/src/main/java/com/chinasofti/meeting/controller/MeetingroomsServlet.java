package com.chinasofti.meeting.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.meeting.dao.MeetingRoomDao;
import com.chinasofti.meeting.service.MeetingRoomService;
import com.chinasofti.meeting.vo.Meetingroom;

public class MeetingroomsServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MeetingRoomService service=new MeetingRoomService();
		List<Meetingroom> roomlist=service.allmeetingrooms();
		
		
		
		request.setAttribute("room", roomlist);
		request.getRequestDispatcher("meetingrooms.jsp").forward(request, response);
	}

}
