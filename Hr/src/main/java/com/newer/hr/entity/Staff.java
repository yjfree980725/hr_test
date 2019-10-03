package com.newer.hr.entity;

public class Staff {

	private Integer id;	//编号
	private String name; //姓名
	private String gender; //性别
	private String job;	//职位

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", gender=" + gender + ", job=" + job + "]";
	}

}
