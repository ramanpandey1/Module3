package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.Student;
@Service
public interface StudentService1 {
	public void create(Student s);
	public List reterive();
	public Student findById(int i);
	public void delete(int id);
    public void update(Student student);

}
