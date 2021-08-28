package com.example.controller;


import com.example.entry.EmployeeEntry;
import com.example.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	private EmployeeService employeeService;


	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public EmployeeEntry create(EmployeeEntry entry) {
		System.out.println(entry);
		return entry;
	}

}
