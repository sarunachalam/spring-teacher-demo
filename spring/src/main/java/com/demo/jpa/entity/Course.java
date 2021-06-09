package com.demo.jpa.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) 
@ToString
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
	private String name;
	
	/*@ManyToOne
    @JoinColumn(name = "t_id")
	@JsonProperty(access = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY)
	private Teacher teacher;
	
	@ManyToOne
    @JoinColumn(name = "dept_id")
	@JsonProperty(access = com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY)
    private Department department;
	
	@OneToMany(mappedBy = "course",fetch=FetchType.LAZY)	
	@JsonManagedReference
    private List<Tcourse> tcourses;
	
	@OneToMany(mappedBy = "course",fetch=FetchType.LAZY)	
	@JsonManagedReference
    private List<Dcourse> dcourses;*/
	
}
