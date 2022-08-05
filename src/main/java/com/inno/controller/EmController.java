package com.inno.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inno.model.Employee;
import com.inno.service.ServiceIMPL;

@RestController
public class EmController {
	@Autowired
	private ServiceIMPL serviceIMPL;
	@PostMapping(value="/one",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Employee> one(@RequestBody Employee employee){
		
		Employee singlesave = serviceIMPL.singlesave(employee);
		
		return new ResponseEntity<Employee>(singlesave,HttpStatus.OK);
		
		
	}

@PostMapping(value="/two",consumes = "application/json",produces = "application/json")
	public ResponseEntity<List<Employee>> multi(@RequestBody List<Employee> empList){
		
		List<Employee> multisave = serviceIMPL.multisave(empList);
		
		
		return new ResponseEntity<List<Employee>>(multisave,HttpStatus.OK);}
	
@GetMapping(value="get1",produces = "application/json")
public ResponseEntity<Optional<Employee>> byi(@RequestBody int a){
	
	Optional<Employee> getone = serviceIMPL.getone(a);
	return new ResponseEntity<Optional<Employee>>(getone,HttpStatus.OK);
	 
}
@GetMapping(value="all")
public ResponseEntity<List<Employee>> all1(){
	
	List<Employee> hav = serviceIMPL.hav();
	
	return new ResponseEntity<List<Employee>>(hav,HttpStatus.OK);}

 
@PostMapping(value="/del")
public ResponseEntity<String> rem(@RequestBody int i){
	
	String dele = serviceIMPL.dele(i);
	
	return new ResponseEntity<String>(dele,HttpStatus.OK);
	
	
}
@PostMapping(value="remo")
public ResponseEntity<String> em(){
	String string = serviceIMPL.alld();
	
	return new ResponseEntity<String>(string,HttpStatus.OK);
	
	
	
}
@GetMapping(value="/spec")
public ResponseEntity<List<Employee>> les(@RequestBody Double i){
	
	List<Employee> findByEi = serviceIMPL.findByEi(i);
	return new ResponseEntity<List<Employee>>(findByEi,HttpStatus.OK);}

@GetMapping(value="/login",consumes = "application/json",produces = "application/json")
public ResponseEntity<String> login(@RequestBody Employee employee){
	
	Employee log = serviceIMPL.logi(employee.getEmail(), employee.getEname());
	
	if (log!=null) {
		String s="logine Successfull";
		return new ResponseEntity<String>(s,HttpStatus.ACCEPTED);
	}
	else {
		
		String m="logine Unsuccessfull";
		

	return new ResponseEntity<String>(m,HttpStatus.OK);}

}

}