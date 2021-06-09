package com.demo.jpa.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.dto.OrderRequest;
import com.demo.jpa.entity.Course;
import com.demo.jpa.entity.Department;
import com.demo.jpa.entity.Teacher;
import com.demo.jpa.repository.CourseRepository;
import com.demo.jpa.repository.DepartmentRepository;
import com.demo.jpa.repository.TeacherRepository;
import com.demo.jpa.service.DepartmentService;
import com.demo.jpa.service.TeacherService;

@RequestMapping("/demo")
@RestController
public class OrderController {
    
	 @Autowired
	 private TeacherRepository teacherRepository ;
	 @Autowired
	 private DepartmentRepository departmentRepository;
	 @Autowired
	 private CourseRepository courseRepository;
	 @Autowired
	 private TeacherService teacherService;
	 @Autowired
	 private DepartmentService departmentService;
	 
	@PostMapping("/teacher/save")
    public Teacher saveTeacher(@RequestBody OrderRequest request){
       return teacherRepository.saveAndFlush(request.getTeacher());
    }
	@PostMapping("/department/save")
    public Department saveDepartment(@RequestBody OrderRequest request){
       return departmentRepository.save(request.getDepartment());
    }
	@PostMapping("/course/save")
    public Course saveCourse(@RequestBody OrderRequest request){
       return courseRepository.save(request.getCourse());
    }
	
	@GetMapping("/teacher/get")
	public Teacher[] teachersCollection(){
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers = teacherService.getTeachersCollection();
		return teachers.stream().toArray(Teacher[]::new);
	}
	
	@GetMapping("/department/get")
	public Department[] departmentCollection(){
		List<Department> departments = new ArrayList<Department>();
		departments = departmentService.getDepartmentCollections();
		return departments.stream().toArray(Department[]::new);
	}
	@GetMapping("/course/get")
	public Course[] courseCollection(){
		List<Course> departments = new ArrayList<Course>();
		departments = courseRepository.findAll();
		return departments.stream().toArray(Course[]::new);
	}
	@GetMapping("/getTeacher/Details")
	public List<?> getTeacherDetails(){
		List<?> objects = teacherService.getDetails();
		return objects;
	}
}
