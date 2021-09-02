package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.entry.Builder;
import com.example.entry.EmployeeEntry;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public EmployeeEntry create(EmployeeEntry entry) {
		return employeeDao.create(Builder.convert(entry, null));
	}

	@Override
	public EmployeeEntry findById(int employeeId) {
		return employeeDao.findById(employeeId);
	}

	@Override
	public EmployeeEntry getAll() {
		return null;
	}

	@Override
	public EmployeeEntry update(EmployeeEntry entry) {
		return employeeDao.update(Builder.convert(entry,null));
	}
}
