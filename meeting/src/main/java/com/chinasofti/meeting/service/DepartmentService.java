package com.chinasofti.meeting.service;

import java.util.List;

import com.chinasofti.meeting.dao.DepartmentDao;
import com.chinasofti.meeting.vo.Department;

public class DepartmentService {
	
	private DepartmentDao dao = new DepartmentDao();

	public List<Department> viewAllDepartments() {
		
		return dao.selectAll();
	}

	public void addDepartment(String departmentname) {
		dao.insert(departmentname);
		
	}

	public void deleteDepartment(int i) {
		dao.delete(i);
		
	}

	public void updateNameById(int departmentid, String departmentname) {
		dao.updateNameById(departmentid,departmentname);
		
	}

}
