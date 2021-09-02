package com.example.controller;


import com.example.entity.EmployeeEntity;
import com.example.entry.EmployeeEntry;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;


	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public EmployeeEntry create(@RequestBody EmployeeEntry entry) {
		return employeeService.create(entry);
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public EmployeeEntry update(@RequestBody EmployeeEntry entry,@PathVariable int id) {
		EmployeeEntry employeeEntry=employeeService.findById(id);
		if(employeeEntry!=null) {
			employeeEntry.setEmail(entry.getEmail());
			employeeEntry.setFname(entry.getFname());
			employeeEntry.setLname(entry.getLname());
			employeeEntry.setEmail(entry.getEmail());
			employeeEntry.setDate(entry.getDate());
			return employeeService.update(employeeEntry);
		}
		return employeeService.create(entry);
	}
}
