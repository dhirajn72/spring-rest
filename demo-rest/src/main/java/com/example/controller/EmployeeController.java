package com.example.controller;


import com.example.entry.EmployeeEntry;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;


	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public EmployeeEntry create(@RequestBody EmployeeEntry entry) {
		return employeeService.create(entry);
	}
}
