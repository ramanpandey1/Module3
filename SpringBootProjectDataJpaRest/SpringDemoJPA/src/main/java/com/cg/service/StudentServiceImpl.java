package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.StudentDaoI;
import com.cg.Entity.Student;
@Service
public class StudentServiceImpl implements StudentService1{
	@Autowired
    StudentDaoI studao;
    
	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		studao.create(s);
	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		return studao.retrieve();
	}

	@Override
	public Student findById(int i) {
		// TODO Auto-generated method stub
		return studao.findById(i);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studao.delete(id);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
        studao.update(student);
	}

	
  
	
}
