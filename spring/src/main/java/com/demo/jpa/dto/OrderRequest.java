package com.demo.jpa.dto;

import com.demo.jpa.entity.Course;
import com.demo.jpa.entity.Department;
import com.demo.jpa.entity.Teacher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Teacher teacher;
    
    private Department department;
    
    private Course course;
}
