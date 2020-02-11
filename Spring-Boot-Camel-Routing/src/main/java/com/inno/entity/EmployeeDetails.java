package com.inno.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmployeeDetails {

	private Integer deptNo;

	private String deptName;

	private Long salary;

}
