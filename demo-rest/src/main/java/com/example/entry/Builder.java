package com.example.entry;

import com.example.entity.EmployeeEntity;

import java.time.LocalDateTime;

public class Builder {
	public static EmployeeEntry convert(EmployeeEntity entity, EmployeeEntry entry) {
		return new EmployeeEntry(entity.getId(),entity.getFname(),entity.getLname(),entity.getEmail(),entity.getPhone(), entity.getDate());
	}

	public static EmployeeEntity convert(EmployeeEntry entry, EmployeeEntity entity) {
		return new EmployeeEntity(entry.getId(), entry.getFname(), entry.getLname(), entry.getEmail(), entry.getPhone(), entry.getDate()) ;
	}
}
