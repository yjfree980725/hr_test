package com.newer.hr.service;

import java.util.List;


import com.newer.hr.entity.Staff;

public interface StaffService {

	List<Staff> findAll();
	
	List<Staff> findPage(int size, int start);
	
	int count();
	
	void delete(int id);

	void save(Staff staff);
	
	void update(Staff staff);
	
	Staff edit(int id);
	
}
