package com.example.dao;

import com.example.datasource.HibernateUtil;
import com.example.entity.EmployeeEntity;
import com.example.entry.Builder;
import com.example.entry.EmployeeEntry;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {


	@Override
	public EmployeeEntry create(EmployeeEntity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Integer addressId = (Integer) session.save(entity);
		transaction.commit();
		session.close();
		return Builder.convert(entity,null);

	}

	@Override
	public EmployeeEntry findById(int employeeId) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		EmployeeEntity entity=session.load(EmployeeEntity.class,employeeId);
		EmployeeEntry entry=Builder.convert(entity,null);
		session.close();
		return entry;
	}

	@Override
	public EmployeeEntry getAll() {
		return null;
	}

	@Override
	public EmployeeEntry update(EmployeeEntity entry) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(entry);
		transaction.commit();
		session.close();
		return Builder.convert(entry,null);
	}
}