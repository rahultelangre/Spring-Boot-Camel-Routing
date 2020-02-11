package com.inno.model;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.inno.entity.Employee;
import com.inno.entity.EmployeeDetails;

@Component
public class SetAllEmployeeInfo {

	@Handler
	public void process(Exchange exchange) {
		int id = (int) exchange.getProperty("empId");
		String email = (String) exchange.getProperty("email");
		String name = (String) exchange.getProperty("empName");

		List<EmployeeDetails> empDetails = exchange.getProperty("e_details_service", List.class);

		Employee e = new Employee();
		e.setEmpId(id);
		e.setEmpName(name);
		e.setEmail(email);
		e.setEmpDetails(empDetails);
		System.out.println(e);
		exchange.getIn().setBody(e);
	}
}
