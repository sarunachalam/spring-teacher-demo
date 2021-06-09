package com.demo.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.jpa.entity.Department;
import com.demo.jpa.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	 private DepartmentRepository departmentRepository;
	
	//@Cacheable("departmentcollection")
	public List<Department> getDepartmentCollections() {
		List<Department> departments = new ArrayList<Department>();
		departments = departmentRepository.findAll();
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return departments;
	}
}
