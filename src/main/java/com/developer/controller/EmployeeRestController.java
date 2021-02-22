package com.developer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.developer.model.Employee;
import com.developer.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping("/employees")
	void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}

}
