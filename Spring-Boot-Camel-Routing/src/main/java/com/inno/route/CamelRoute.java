package com.inno.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.inno.model.EmployeeDetailsService;
import com.inno.model.EmployeeService;
import com.inno.model.SetAllEmployeeInfo;

@Component
public class CamelRoute extends RouteBuilder {

	
	@Override
	public void configure() throws Exception {
		
		  from("direct:first") .bean(new EmployeeDetailsService()) .bean(new
		  EmployeeService()) .bean(new SetAllEmployeeInfo()).end();
		 
		
	//	from("direct:first").choice()
	//	.when(body().contains("Hello, world!")).process(new PrintClass());
	}

}
