package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"project"})
public class Employee extends BaseModel {
	@Column(name = "contact_no")
	@Pattern(regexp = "^[6-9]\\d{9}$")
	private String contactNo;
	@ManyToOne
	@JoinColumn(name = "department_id",nullable = false)
	private Department department;
	@ManyToMany
	@JoinTable(name = "projects_employees",joinColumns = @JoinColumn(name="project_id",nullable = false),inverseJoinColumns = @JoinColumn(name="employee_id",nullable = false))
	private List<Project> project;
	@Embedded
	private Address address;
	
	public Employee(Long id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super(id, name, createdAt, updatedAt);
		// TODO Auto-generated constructor stub
	}

	

	
}
