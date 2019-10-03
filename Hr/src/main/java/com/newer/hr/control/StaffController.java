package com.newer.hr.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newer.hr.entity.Staff;
import com.newer.hr.service.StaffService;

/**
 * 
 * @author Administrator
 */
@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;

	// 查询
	// GET 默认/api/v1/staff
//	@GetMapping
//	public List<Staff> list() {
//		return staffService.findAll();
//	}

	//分页查询
	// GET /api/v1/staff?s=100
	@GetMapping
	public Map<String, Object> list(
			@RequestParam(name = "size", defaultValue = "5") int size,
			@RequestParam(name = "start", defaultValue = "0") int start) {

		List<Staff> list = staffService.findPage(size, start);
		int count = staffService.count();

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("staffs", list);
		data.put("count", count);
		return data;
	}

	// 创建
	// POSR /api/v1/staff
	@PostMapping()
	public Map<String, Object> create(@RequestBody Staff staff) {
		staffService.save(staff);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "ok");
		return map;
	}

	// 更新 PUT /staff/{id}
	@PutMapping("/{id}")
	public Map<String, Object> update(@PathVariable int id, @RequestBody Staff staff) {
		staffService.update(staff);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "ok");
		return map;
	}

	// 删除 // GET /api/v1/staff/123
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		staffService.delete(id);
		return "ok";
	}

	// 编辑 // GET /api/v1/staff/123
	@GetMapping("/{id}")
	public Staff edit(@PathVariable int id) {
		Staff staff = staffService.edit(id);
		return staff;
	}

}
