package com.inno.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {

	private Integer empId;
	private String empName;
	private String email;
	private List<EmployeeDetails> empDetails;

}
