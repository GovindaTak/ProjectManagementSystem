package com.example.demo.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.Dto.request.CreateDepartmentWithEmployeesAndProjectsRequestDto;
import com.example.demo.Dto.request.DepartmentRequestDto;
import com.example.demo.Dto.response.DepartmentResponseDto;
import com.example.demo.Dto.response.FullDepartmentResponse;
import com.example.demo.Dto.response.ProjectResponseDto;

public interface DepartmentService {
	
	public ResponseEntity<DepartmentResponseDto> getDepartment(Long id);
	public ResponseEntity<FullDepartmentResponse> getAllDetailsOfDepartment(Long id);
	
	public ResponseEntity<List<DepartmentResponseDto>> getListOfDepartment();
	
	public ResponseEntity<DepartmentResponseDto> removeDepartment();
	
	public ResponseEntity<DepartmentResponseDto> updateDepartment(Long id,DepartmentRequestDto department);
	
	public ResponseEntity<List<ProjectResponseDto>> getProjects(Long id);
	
	public ResponseEntity<DepartmentResponseDto> createDepartment(DepartmentRequestDto newDepartment);
	
	public ResponseEntity<FullDepartmentResponse> createDepartmentWithEmployeesAndProjects(CreateDepartmentWithEmployeesAndProjectsRequestDto newDepartment);
	

}
