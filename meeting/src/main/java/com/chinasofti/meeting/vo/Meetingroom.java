package com.chinasofti.meeting.vo;

public class Meetingroom {
	private Integer roomid;
	private Integer roomnum;
	private String roomname;
	private Integer capacity;
	private String status;
	private String description;
	public Integer getRoomid() {
		return roomid;
	}
	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}
	public Integer getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(Integer roomnum) {
		this.roomnum = roomnum;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Meetingroom [roomid=" + roomid + ", roomnum=" + roomnum + ", roomname=" + roomname + ", capacity="
				+ capacity + ", status=" + status + ", description=" + description + "]";
	}
	
	
	
	
}
