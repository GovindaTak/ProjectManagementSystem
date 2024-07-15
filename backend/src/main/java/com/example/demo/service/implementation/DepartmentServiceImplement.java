package com.example.demo.service.implementation;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.request.CreateDepartmentWithEmployeesAndProjectsRequestDto;
import com.example.demo.Dto.request.DepartmentRequestDto;
import com.example.demo.Dto.response.DepartmentResponseDto;
import com.example.demo.Dto.response.FullDepartmentResponse;
import com.example.demo.Dto.response.ProjectResponseDto;
import com.example.demo.service.interfaces.DepartmentService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class DepartmentServiceImplement implements DepartmentService {

	@Override
	public ResponseEntity<DepartmentResponseDto> getDepartment(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<FullDepartmentResponse> getAllDetailsOfDepartment(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<DepartmentResponseDto>> getListOfDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DepartmentResponseDto> removeDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DepartmentResponseDto> updateDepartment(Long id, DepartmentRequestDto department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<ProjectResponseDto>> getProjects(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<DepartmentResponseDto> createDepartment(DepartmentRequestDto newDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<FullDepartmentResponse> createDepartmentWithEmployeesAndProjects(
			CreateDepartmentWithEmployeesAndProjectsRequestDto newDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

}
