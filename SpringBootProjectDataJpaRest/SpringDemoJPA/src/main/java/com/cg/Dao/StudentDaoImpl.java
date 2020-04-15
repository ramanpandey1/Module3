package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Student;
@Transactional
@Repository
public class StudentDaoImpl implements StudentDaoI{
	@PersistenceContext
    EntityManager em;

	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		em.persist(s);
	}

	@Override
	public List retrieve() {
		String str="SELECT user FROM Student user";
		TypedQuery<Student> query=em.createQuery(str,Student.class);
		return query.getResultList();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Student.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student s=em.find(Student.class, id);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getDept() );
		em.remove(s);
		
	}

	@Override
	public void update(Student student) {
	em.merge(student);
		
	}
	
	

}
