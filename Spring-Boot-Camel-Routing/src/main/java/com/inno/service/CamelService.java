package com.inno.service;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import com.inno.entity.Employee;

@Service
public class CamelService {

	@Produce("direct:first")
	ProducerTemplate producerTemplate;

	public Employee getEmployee() {
		// here we are giving empty object to the router builder and ofter processing
		// the output will be the Employee type thats why we are giving that
		return producerTemplate.requestBody(new Employee(), Employee.class);
	}
}
