package com.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Leave extends JpaRepository<com.employee.Entity.Leave, Integer> {
	
	public void deleteByPhone(String id);
	
	

}
