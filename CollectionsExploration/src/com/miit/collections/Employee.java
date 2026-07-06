package com.miit.collections;

public class Employee implements Comparable<Employee>{

	
	private long employeeid;
	private double salary;
	private String name;
	public Employee(long employeeid, double salary, String name) {
		super();
		this.employeeid = employeeid;
		this.salary = salary;
		this.name = name;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//Desc
		if(salary==o.salary) {
			return 0;
		}
		else if (salary>o.salary) {
			return -1;
		}
		else {
		return 1;
		}
		
		//asc
		/**
				if(salary==o.salary) {
					return 0;
				}
				else if (salary>o.salary) {
					return 1;
				}
				else {
				return -1;
				}**/
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Name: "+name+" Salary: "+salary+" ID: "+employeeid;
	}
	
}
