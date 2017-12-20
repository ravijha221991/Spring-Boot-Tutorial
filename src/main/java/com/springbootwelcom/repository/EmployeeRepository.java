package com.springbootwelcom.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.springbootwelcom.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable> {

}
