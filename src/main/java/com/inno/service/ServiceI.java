package com.inno.service;

import java.util.List;
import java.util.Optional;

import com.inno.model.Employee;

public interface ServiceI {
	
	public Employee singlesave(Employee employee);
	public List<Employee> multisave(List<Employee> employees);
	public Optional<Employee> getone(int a);
	
	public List<Employee> hav();
	
	public String dele(int i);
	
	public String alld();
	
	public List<Employee> findByEi(Double i);
	
	public Employee logi(String i,String n);
}
