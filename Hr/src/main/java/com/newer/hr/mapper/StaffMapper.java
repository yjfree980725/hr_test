package com.newer.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.hr.entity.Staff;


@Mapper
public interface StaffMapper {

	/**
	 * 查询所有员工信息
	 */
	@Select("select * from staff")
	List<Staff> findAll();
	
	/**
	 * 分页查询员工信息
	 * @param size 大小 limit
	 * @param start 偏移量 offset
	 * @return 
	 */
	@Select("select * from staff limit #{size} offset #{start}")
	List<Staff> findPage(@Param("size") int size, @Param("start") int start);
	
	
	/**
	 * 记录总数
	 * @return int 表中记录的总数，用于计算分页中页面的数量
	 */
	@Select("select count(id) from staff")
	int count();
	
	/**
	 * 删除
	 * @param id
	 */
	@Delete("delete from staff where id = #{id}")
	void delete(@Param("id") int id);

	
	/**
	 * 创建
	 * @param staff
	 */
	@Insert("insert into staff(name,gender,job) values(#{name},#{gender},#{job})")
	void save(Staff staff);
	
	/**
	 * 加载要编辑的数据对象
	 * @param id 主键
	 * @return Staff
	 */
	@Select("select * from staff where id = #{id}")
	Staff edit(@Param("id") int id);
	
	/**
	 * 修改
	 * @param staff
	 */
	@Update("update staff set name=#{name},job=#{job},gender=#{gender} where id = #{id}")
	void update(Staff staff);
	
	
}
