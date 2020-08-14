package com.chinasofti.meeting.service;

import com.chinasofti.meeting.dao.MeetingRoomDao;

public class MeetingRoomService {
	private MeetingRoomDao meetingroomdao = new MeetingRoomDao();
	public Object viewOnMeetingRoom(int roomid) {
		return meetingroomdao.selectByRoomId(roomid);
	}

}
