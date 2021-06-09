package com.demo.jpa.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) 
@ToString
@Entity
public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
	private String name;
	
	@OneToMany
	  @JoinTable(name = "tcourse",
			  joinColumns = {@JoinColumn(name = "t_id", referencedColumnName = "id")}, 
			    inverseJoinColumns = {@JoinColumn(name = "c_id", referencedColumnName = "id")}
	  )
	  private List<Course> courses;
	
	@OneToOne(targetEntity = Department.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "dep_id", referencedColumnName = "id")
    private Department department;
	
}
