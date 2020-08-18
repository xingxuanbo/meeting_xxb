package com.chinasofti.meeting.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.meeting.util.ConnectionFactory;
import com.chinasofti.meeting.vo.Employee;

public class MymeetingdetailsDao {
	private Connection conn;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	
	public static void main(String[] args) {
		MymeetingdetailsDao dao = new MymeetingdetailsDao();
		List<Employee> list = dao.selectAllEmployeesByMeetingid(28);
		for(Employee e:list){
			System.out.println(e);
		}
	}

	public List<Employee> selectAllEmployeesByMeetingid(Integer meetingid) {
		conn=ConnectionFactory.getConnection();
		List<Employee> employeelist = new ArrayList<Employee>();
		String sql = "SELECT * FROM employee, meetingparticipants WHERE employee.employeeid ="
				+ " meetingparticipants.employeeid AND meetingparticipants.meetingid = "+meetingid;
		Employee employee = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				employee = new Employee();
				employee.setEmployeeid(rs.getInt("employeeid"));
				employee.setEmployeename(rs.getString("employeename"));
				employee.setUsername(rs.getString("username"));
				employee.setPhone(rs.getString("phone"));
				employee.setEmail(rs.getString("email"));
				employee.setStatus(rs.getString("status"));
				employee.setDepartmentid(rs.getInt("departmentid"));
				employee.setPassword(rs.getString("password"));
				employee.setRole(rs.getString("role"));
				employeelist.add(employee);
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(conn, pstmt, rs);
		}
		return employeelist;
	}

}
