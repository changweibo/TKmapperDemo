package com.example.demo.seriver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.VO.VOStudent;
import com.example.demo.mapper.OPstudent;
@Service
public class serviceStudentimpl implements studnetservice{
	
	@Autowired
	private OPstudent opstudnet;
	

	@Override
	public List<VOStudent> findstu(String name) {
		return opstudnet.getstudnetInfo(name);
	}


	@Override
	public Integer addstudent(VOStudent vostudnet) {
		int num=opstudnet.addstudent(vostudnet);
		return num;
	}


	@Override
	public Integer updatestudent(VOStudent vostudnet) {
		int num=opstudnet.updatestudent(vostudnet);
		return num;
	}


	@Override
	public Integer delstudent(Integer id) {
		int num= opstudnet.delstudent(id);
		return num;
	}
}
