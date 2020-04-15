package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Student;
@Repository
public interface StudentDaoI {
     public void create(Student s);
     public List retrieve();
     public Student findById(int id);
     public void delete(int id);
     public void update(Student student);
}
