package com.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.LoginData;

public interface Login extends JpaRepository<LoginData, Integer> {
			public LoginData findByEmailAndPassword(String Email,String Password);
}
