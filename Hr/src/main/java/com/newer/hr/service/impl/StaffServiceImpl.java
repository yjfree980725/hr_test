package com.newer.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.hr.entity.Staff;
import com.newer.hr.mapper.StaffMapper;
import com.newer.hr.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public List<Staff> findPage(int size, int start) {
        return staffMapper.findPage(size, start);
    }

    @Override
    public void delete(int id) {
        staffMapper.delete(id);
    }

    @Override
    public void save(Staff staff) {
        staffMapper.save(staff);
    }

    @Override
    public Staff edit(int id) {
        return staffMapper.edit(id);
    }

    @Override
    public void update(Staff staff) {
        staffMapper.update(staff);
    }

    @Override
    public int count() {
        return staffMapper.count();
    }

}
