package com.springbootwelcom.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootwelcom.controller.EmployeeController;
import com.springbootwelcom.model.Employee;
import com.springbootwelcom.repository.EmployeeRepository;

public class EmployeeController {
	private Logger LOGGER = Logger.getLogger(EmployeeController.class.getName());
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		LOGGER.info("Fetched Employee:"+Arrays.toString(employees.toArray()));
		return employees;
	}
}
