package com.inno.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Service;

import com.inno.entity.EmployeeDetails;

@Service
public class EmployeeDetailsService {

	@Handler
	public void process(Exchange exchange) {

		List<EmployeeDetails> details = new ArrayList<EmployeeDetails>();
		details.add(new EmployeeDetails(1, "IT", 10000l));
		details.add(new EmployeeDetails(2, "Testing", 20000l));
		details.add(new EmployeeDetails(3, "Developer", 40000l));

		exchange.setProperty("e_details_service", details);

	}
}
