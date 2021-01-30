package com.clive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.Student;
import com.clive.mapper.StudentMapper;
import com.clive.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> findStudentAll() {
		List<Student> list = studentMapper.findStudentAll();
		return list;
	}

}
