package com.demo.jpa.dto;

import java.util.List;

import com.demo.jpa.entity.Course;
import com.demo.jpa.entity.Department;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TeacherResponse {
	private long count;
	private String teachername;
	private String department;
	//private Course course;
}
