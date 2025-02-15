package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RefreshScope
@RestController
public class EmployeeController {
	   
	   @Autowired
	   EmployeeService employeeService;

	   @RequestMapping("/employee/find/{id}")
	   public Employee findById(@PathVariable Long id){
	      return employeeService.findById(id);
	   }

	   @RequestMapping("/employee/findall")
	   public Collection<Employee> findAll(){
	      return employeeService.findAll();
	   }
}
