package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "projects")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"employee","department"})
public class Project extends BaseModel {
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;
	@ManyToMany(mappedBy = "project")
	private List<Department> department;
	
	
	public Project(Long id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super(id, name, createdAt, updatedAt);
		// TODO Auto-generated constructor stub
	}
	
	
}
