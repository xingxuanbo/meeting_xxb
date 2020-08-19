package com.chinasofti.meeting.service;

import java.util.List;


import com.chinasofti.meeting.dao.MeetingRoomDao;
import com.chinasofti.meeting.vo.Meetingroom;

public class MeetingRoomService {
	private MeetingRoomDao meetingroomdao = new MeetingRoomDao();
	public Meetingroom viewOnMeetingRoom(int roomid) {
		return meetingroomdao.selectByRoomId(roomid);
	}
	public List<Meetingroom> allmeetingrooms() {
		
		return meetingroomdao.selectallmeetingrooms();
	}
	public void updateMeetingroom(Meetingroom room) {
		meetingroomdao.updateMeetingroom(room);
		
	}
	
	
	public void addmeetingroom(Meetingroom room) {
		meetingroomdao.addmeetingroom(room);
		
	}

}
