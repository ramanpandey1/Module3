package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.StudentDaoImpl;
import com.cg.Entity.Student;
import com.cg.service.StudentService1;

@SpringBootApplication
public class SpringDemoJpaApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoJpaApplication.class, args);
	}

	
}
