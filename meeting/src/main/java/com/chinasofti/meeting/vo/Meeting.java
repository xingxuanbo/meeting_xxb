package com.chinasofti.meeting.vo;

import java.sql.Timestamp;

public class Meeting {
	private Integer meetingid;
	private String meetingname;
	private Integer roomid;
	private Integer reservationistid;
	private Integer numberofparticipants;
	private Timestamp starttime;
	private Timestamp endtime;
	private Timestamp reservationtime;
	private Timestamp canceledtime;
	private String description;
	private String status="0";//0：正常   1：取消
	public Integer getMeetingid() {
		return meetingid;
	}
	public void setMeetingid(Integer meetingid) {
		this.meetingid = meetingid;
	}
	public String getMeetingname() {
		return meetingname;
	}
	public void setMeetingname(String meetingname) {
		this.meetingname = meetingname;
	}
	public Integer getRoomid() {
		return roomid;
	}
	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}
	public Integer getReservationistid() {
		return reservationistid;
	}
	public void setReservationistid(Integer reservationistid) {
		this.reservationistid = reservationistid;
	}
	public Integer getNumberofparticipants() {
		return numberofparticipants;
	}
	public void setNumberofparticipants(Integer numberofparticipants) {
		this.numberofparticipants = numberofparticipants;
	}
	public Timestamp getStarttime() {
		return starttime;
	}
	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}
	public Timestamp getEndtime() {
		return endtime;
	}
	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}
	public Timestamp getReservationtime() {
		return reservationtime;
	}
	public void setReservationtime(Timestamp reservationtime) {
		this.reservationtime = reservationtime;
	}
	public Timestamp getCanceledtime() {
		return canceledtime;
	}
	public void setCanceledtime(Timestamp canceledtime) {
		this.canceledtime = canceledtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Meeting(Integer meetingid, String meetingname, Integer roomid, Integer reservationistid,
			Integer numberofparticipants, Timestamp starttime, Timestamp endtime, Timestamp reservationtime,
			Timestamp canceledtime, String description, String status) {
		super();
		this.meetingid = meetingid;
		this.meetingname = meetingname;
		this.roomid = roomid;
		this.reservationistid = reservationistid;
		this.numberofparticipants = numberofparticipants;
		this.starttime = starttime;
		this.endtime = endtime;
		this.reservationtime = reservationtime;
		this.canceledtime = canceledtime;
		this.description = description;
		this.status = status;
	}
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Meeting [meetingid=" + meetingid + ", meetingname=" + meetingname + ", roomid=" + roomid
				+ ", reservationistid=" + reservationistid + ", numberofparticipants=" + numberofparticipants
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", reservationtime=" + reservationtime
				+ ", canceledtime=" + canceledtime + ", description=" + description + ", status=" + status + "]";
	}
	

}
