package com.example.dao;

import com.example.entity.EmployeeEntity;
import com.example.entry.EmployeeEntry;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
	public EmployeeEntry create(EmployeeEntity entry);
	public EmployeeEntry findById(int employeeId);
	public EmployeeEntry getAll();
	public EmployeeEntry update(EmployeeEntity entry);
}
