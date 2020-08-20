package com.chinasofti.meeting.service;

import java.sql.Timestamp;
import java.util.List;

import com.chinasofti.meeting.dao.MeetingDao;
import com.chinasofti.meeting.dao.MymeetingdetailsDao;
import com.chinasofti.meeting.vo.Meeting;

public class MeetingService {
	private MeetingDao meetingDao=new MeetingDao();
	private MymeetingdetailsDao parDao = new MymeetingdetailsDao();
	public List<Meeting> viewMyBookingInfo(Integer reservationistid) {
		
		return meetingDao.selectAllMeetingsByReserId(reservationistid);
	}
	public void cancelMeeting(Integer meetingid) {
		meetingDao.update(meetingid,"1",new Timestamp(System.currentTimeMillis()));
		
	}
	public List<Meeting> mymeetings(Integer employeeid) {
		
		return parDao.selectAllMeetingByPartId(employeeid);
	}

}
