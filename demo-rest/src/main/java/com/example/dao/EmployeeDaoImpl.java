package com.example.dao;

import com.example.datasource.HibernateUtil;
import com.example.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {


	@Override
	public EmployeeEntity create(EmployeeEntity entry) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Integer addressId = (Integer) session.save(entry);
		//Integer bookingId = (Integer) session.save();
		transaction.commit();
		session.close();
		return entry;

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