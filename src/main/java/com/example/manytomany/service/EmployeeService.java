package com.example.manytomany.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.manytomany.entity.Employee;
import com.example.manytomany.entity.Projects;

@Service
public interface EmployeeService {
	public void addEmployee(Set<Employee> employee);
	public void addProjects(Set<Projects> projects);
	public Employee findDetails(int id);

}
