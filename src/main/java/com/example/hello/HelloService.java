package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloRepository helloRepository;
	
	public Employee getEmployee(String id) {
		
		Map<String, Object> employeeMap = helloRepository.findById(id);
		
		String employeeId = (String) employeeMap.get("id");
		String employeeName = (String) employeeMap.get("name");
		int employeeAge = (Integer) employeeMap.get("age");
		
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setEmployeeAge(employeeAge);
		
		return employee;
	}
}
