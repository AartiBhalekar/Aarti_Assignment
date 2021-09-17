package com.eg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Employee { 						
	int empid;
	String empname;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
}
 
public class Emp1 {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(101, "Abc"), new Employee(102, "Pqr"), new Employee(103, "Xyz"),
				new Employee(104, "Mno"), new Employee(105, "Ijk"));
		
		emp.stream().map(Employee::getEmpid)
		.forEach((id -> 
		{
			System.out.println("id :"+id);
		}));

	}
}
