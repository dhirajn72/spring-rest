package com.example.dao;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao<EmployeeEntity> {
	public EmployeeEntity create(EmployeeEntity entry);
	public EmployeeEntity getById(int employeeId);
	public EmployeeEntity getAll();
	public EmployeeEntity update(EmployeeEntity entry);
}
