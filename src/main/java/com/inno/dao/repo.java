package com.inno.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inno.model.Employee;
@Repository
public interface repo extends JpaRepository<Employee, Integer> {
	public List<Employee> findByEsallLessThan(double i);
	
	public Employee findByEmailAndEname(String i,String n);
}
