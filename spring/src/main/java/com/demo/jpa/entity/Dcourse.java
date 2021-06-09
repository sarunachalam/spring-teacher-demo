package com.demo.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Id;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Dcourse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
	
	@ManyToOne
    @JoinColumn(name = "d_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonManagedReference
	private Department department;
	
	@ManyToOne
    @JoinColumn(name = "c_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JsonManagedReference
	private Course course;
}
