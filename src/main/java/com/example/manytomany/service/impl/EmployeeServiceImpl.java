package com.example.manytomany.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytomany.controller.dao.EmployeeDao;
import com.example.manytomany.controller.dao.ProjectsDao;
import com.example.manytomany.entity.Employee;
import com.example.manytomany.entity.Projects;
import com.example.manytomany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao edao;
	@Autowired
	private ProjectsDao pdao;

	@Override
	public void addEmployee(Set<Employee> employee) {
		edao.saveAll(employee);

	}

	@Override
	public void addProjects(Set<Projects> projects) {
		pdao.saveAll(projects);

	}

	@Override
	public Employee findDetails(int id) {
		Employee employee=edao.findById(id).get();
		return employee;
	}

}
