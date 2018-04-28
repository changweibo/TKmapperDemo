package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.VO.VOStudent;

@Mapper
public interface OPstudent  {
	
	List<VOStudent> getstudnetInfo(@Param("name") String name);
	
	int addstudent(VOStudent vostudent);
	
	int updatestudent(VOStudent vostudnet);
	
	int delstudent(int id);
	
}
