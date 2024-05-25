package com.spring.jdbctemplate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	private int id;
	private String name;
	private long contactNumber;
	private String address;

}
