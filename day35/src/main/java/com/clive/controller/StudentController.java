package com.clive.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clive.bean.Student;
import com.clive.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentController {
	@Autowired
	private StudentService service;
	@Test
	public void demo1() {
     List<Student> list = service.findStudentAll();
     for (Student student : list) {
		System.out.println(student);
	}
	}
}
