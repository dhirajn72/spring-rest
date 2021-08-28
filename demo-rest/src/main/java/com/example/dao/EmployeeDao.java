package com.example.dao;

import com.example.entity.EmployeeEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
	public EmployeeEntity create(EmployeeEntity entry);
	public EmployeeEntity getById(int employeeId);
	public EmployeeEntity getAll();
	public EmployeeEntity update(EmployeeEntity entry);
}
