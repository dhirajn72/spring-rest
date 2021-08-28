package com.example.service;

import com.example.entry.EmployeeEntry;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	public EmployeeEntry create(EmployeeEntry entry);
	public EmployeeEntry getById(int employeeId);
	public EmployeeEntry getAll();
	public EmployeeEntry update(EmployeeEntry entry);
}
