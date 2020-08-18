package com.chinasofti.meeting.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.meeting.util.ConnectionFactory;
import com.chinasofti.meeting.vo.Meetingroom;

public class MeetingRoomDao {
	private Connection conn;
	public Meetingroom selectByRoomId(int roomid) {
		conn = ConnectionFactory.getConnection();
		Meetingroom meetingRoom = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null ;
		
		String sql = "select * from meetingroom where roomid=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, roomid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				meetingRoom = new Meetingroom();
				meetingRoom.setRoomid(Integer.parseInt(rs.getString("roomid")));
				meetingRoom.setRoomnum(Integer.parseInt(rs.getString("roomnum")));
				meetingRoom.setCapacity(Integer.parseInt(rs.getString("capacity")));
				meetingRoom.setRoomname(rs.getString("roomname"));
				meetingRoom.setStatus(rs.getString("status"));
				meetingRoom.setDescription(rs.getString("description"));
				
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(conn, pstmt, rs);
		}
		
		
		return meetingRoom;
	}
	public static void main(String[] args) {
		MeetingRoomDao dao = new MeetingRoomDao();
		Meetingroom m = dao.selectByRoomId(8);
		System.out.println(m);
	}
	public List<Meetingroom> selectallmeetingrooms() {
		conn = ConnectionFactory.getConnection();
		List<Meetingroom> list = new ArrayList<Meetingroom>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from meetingroom ";
		Meetingroom meetingroom = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				meetingroom = new Meetingroom();
				meetingroom.setRoomid(Integer.parseInt(rs.getString("roomid")));
				meetingroom.setRoomnum(Integer.parseInt(rs.getString("roomnum")));
				meetingroom.setCapacity(Integer.parseInt(rs.getString("capacity")));
				meetingroom.setRoomname(rs.getString("roomname"));
				meetingroom.setStatus(rs.getString("status"));
				meetingroom.setDescription(rs.getString("description"));
				list.add(meetingroom);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(conn, pstmt, rs);
		}
		
		return list;
	}
	

}
