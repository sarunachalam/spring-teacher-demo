package com.demo.jpa.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true) 
@Entity
public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
	private String name;
	
	@OneToMany
	  @JoinTable(name = "dcourse",
			  joinColumns = {@JoinColumn(name = "d_id", referencedColumnName = "id")}, 
			    inverseJoinColumns = {@JoinColumn(name = "c_id", referencedColumnName = "id")}
	  )
	  private List<Course> courses;
	
	/* @OneToOne(mappedBy = "department")
	 @JsonManagedReference
	 private Teacher teacher;*/
	 
}
