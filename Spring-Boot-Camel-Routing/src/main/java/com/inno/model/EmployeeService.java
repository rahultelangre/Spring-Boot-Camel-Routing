package com.inno.model;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Service;

import com.inno.entity.Employee;
import com.inno.entity.EmployeeDetails;

@Service
public class EmployeeService {

	@SuppressWarnings("unchecked")
	@Handler
	public void process(Exchange exchange) {

		/*
		 * Employee emp1 = new Employee(); emp1.setEmpId(1);
		 * emp1.setEmail("mady@gmail.com"); emp1.setEmpName("Mady"); EmployeeDetails
		 * empDetails = exchange.getProperty("e_details_service",
		 * EmployeeDetails.class); emp1.setEmpDetails((List<EmployeeDetails>)
		 * empDetails);
		 */
		exchange.setProperty("empId", 1);
		exchange.setProperty("email", "mady@gmail.com");
		exchange.setProperty("empName", "Mady");

	}
}
