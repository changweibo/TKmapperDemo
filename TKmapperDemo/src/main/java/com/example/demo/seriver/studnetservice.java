package com.example.demo.seriver;

import java.util.List;

import com.example.demo.VO.VOStudent;

public interface studnetservice {
	
	
	List<VOStudent> findstu(String name);
	
	Integer addstudent(VOStudent vostudnet);
	
	Integer updatestudent(VOStudent vostudnet);
	
	Integer delstudent(Integer id);
	
	
}
