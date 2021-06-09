package com.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
