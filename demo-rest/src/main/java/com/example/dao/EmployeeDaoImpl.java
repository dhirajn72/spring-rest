package com.example.dao;

import com.example.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDao<EmployeeEntity> {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

	@Transactional
	@Override
	public EmployeeEntity create(EmployeeEntity entry) {
		Session session=sessionFactory.openSession();
		return (EmployeeEntity) session.save(entry);
	}

	@Override
	public EmployeeEntity getById(int employeeId) {
		return null;
	}

	@Override
	public EmployeeEntity getAll() {
		return null;
	}

	@Override
	public EmployeeEntity update(EmployeeEntity entry) {
		return null;
	}
}
