package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VO.VOStudent;
import com.example.demo.seriver.serviceStudentimpl;

@RestController
public class findStudent {
	@Autowired
	private serviceStudentimpl ser;

	@RequestMapping(value = "/findStudent")
	public List<VOStudent> findstu(String name) {
		return ser.findstu(name);

	}

	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public Integer addstu(@RequestBody VOStudent vostu) {
		VOStudent vos= new VOStudent();
		vos.setName(vostu.getName());
		vos.setAge(vostu.getAge());
		vos.setSex(vostu.getSex());

		
		return ser.addstudent(vos);
		
	}
	
	@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
	public Integer updatestu(@RequestBody VOStudent vostu) {
		VOStudent vos= new VOStudent();
		vos.setId(vostu.getId());
		vos.setName(vostu.getName());
		vos.setAge(vostu.getAge());
		vos.setSex(vostu.getSex());
		return ser.updatestudent(vos);
	}
	
	@RequestMapping(value="/delStudent")
	public Integer delstu(Integer id) {
		return ser.delstudent(id);
	}
	
	
}
