package com.developer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.model.Employee;
import com.developer.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

}
