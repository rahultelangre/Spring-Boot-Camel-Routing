package com.inno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inno.entity.Employee;
import com.inno.service.CamelService;

@RestController
public class CamelController {

	@Autowired
	private CamelService service;

	@GetMapping("/employee")
	public Employee getEmployee() {
		return service.getEmployee();
	}
}
