package com.demo.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.jpa.entity.Teacher;
import com.demo.jpa.repository.TeacherRepository;

@Service
public class TeacherService {
	 @Autowired
	 private TeacherRepository teacherRepository ;
	 
	// @Cacheable("teacherscollection")
	public List<Teacher> getTeachersCollection() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers = teacherRepository.findAll();
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teachers;
	}
	 public List<?> getDetails(){
		return teacherRepository.teachersCollection();
		 
	 }
	 public List<?> teachersCollectionbydepart(){
		return teacherRepository.teachersCollectionbydepart();			 
	}
	 
}
