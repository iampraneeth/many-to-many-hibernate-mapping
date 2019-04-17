package com.example.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.entity.Employee;
import com.example.manytomany.entity.Projects;
import com.example.manytomany.service.EmployeeService;

@RestController
public class ManyToManyController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public void set() {
		Set<Employee> employee1 = new HashSet<Employee>();
		Set<Employee> employee2 = new HashSet<Employee>();
		Set<Employee> employee3 = new HashSet<Employee>();

		Set<Projects> projects1 = new HashSet<Projects>();
		Set<Projects> projects2 = new HashSet<Projects>();
		Set<Projects> projects3 = new HashSet<Projects>();

		Employee emp1 = new Employee(1, "Ram");
		Employee emp2 = new Employee(2, "siri");
		Employee emp3 = new Employee(3, "anu");

		Projects prj1 = new Projects(101, "java");
		Projects prj2 = new Projects(102, "python");
		Projects prj3 = new Projects(103, "oracle");

		employee1.add(emp1);
		employee1.add(emp3);
		employee2.add(emp2);
		employee3.add(emp2);

		prj1.setEmployee(employee1);
		prj2.setEmployee(employee2);
		prj3.setEmployee(employee3);

		projects1.add(prj1);
		projects1.add(prj3);
		projects2.add(prj1);
		projects3.add(prj2);

		service.addEmployee(employee1);
		service.addEmployee(employee2);
		service.addEmployee(employee3);

		service.addProjects(projects1);
		service.addProjects(projects2);
		service.addProjects(projects3);

	}

	@RequestMapping("/get")
	public Set<Employee> get() {
		Set<Employee> employee = new HashSet<Employee>();
		for (int i = 1; i < 4; i++) {
			employee.add(service.findDetails(i));
		}
		return employee;
	}

}
