package com.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
