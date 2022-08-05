package com.inno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.dao.repo;
import com.inno.model.Employee;

@Service
public class ServiceIMPL implements ServiceI {
@Autowired
	 private repo red;
	@Override
	public Employee singlesave(Employee employee) {
		Employee employee2 = red.save(employee);
		return employee2;
	}

	@Override
	public List<Employee> multisave(List<Employee> emList) {
		List<Employee> saveAll = red.saveAll(emList);
		return saveAll;
	}

	@Override
	public Optional<Employee> getone(int a) {
		Optional<Employee> findById = red.findById(a);
		return findById;
	}

	@Override
	public List<Employee> hav() {
		List<Employee> findAll = red.findAll();
		return findAll;
	}

	@Override
	public String dele(int i) {
		red.deleteById(i);
		String s="deleted successfully";
		return s;
	}

	@Override
	public String alld() {
		red.deleteAll();
		String d="all data deleted";
		return d;
	}

	@Override
	public List<Employee> findByEi(Double i) {
		List<Employee> findByEidLessThan = red.findByEsallLessThan(i);
		
		return findByEidLessThan;
	}

	@Override
	public Employee logi(String i, String n) {
		Employee findByEidAndEname= red.findByEmailAndEname(i, n);
		System.out.println(findByEidAndEname);
		if(findByEidAndEname !=null) {
		
		return findByEidAndEname;
			}
	else {
		
		return null ;	
	}
		
		
	}}

