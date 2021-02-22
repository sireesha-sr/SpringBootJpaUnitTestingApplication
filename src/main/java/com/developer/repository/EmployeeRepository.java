package com.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.repository.CrudRepository;*/
import org.springframework.stereotype.Repository;

import com.developer.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
