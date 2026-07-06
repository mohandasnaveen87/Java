package com.miit;

final class Department{
	
	private final int id;
	private final String name;
	
	private final Employee[] employees;

	
	public Department(int id, String name, Employee[] employees) {
		super();
		this.id = id;
		this.name = name;
	//	this.employees = employees.clone();
		//this.employees = employees;
		this.employees=new Employee[employees.length];
		for(int j=0;j<employees.length;j++) {
			this.employees[j]=new Employee(employees[j]);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee[] getEmployees() {
		
		Employee[] copy=new Employee[employees.length];
		for(int j=0;j<employees.length;j++) {
			copy[j]=new Employee(employees[j]);
		}
		//return employees.clone();
		return copy;
	}
	
	
}

//final class Employee {
//
//	private final int id;
//	private final String name;
//
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//}

class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(Employee emp) {
		// TODO Auto-generated constructor stub
		this.id=emp.getId();
		this.name=emp.getName();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
public class TestDeepCopyWithReferenceTypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
        Employee emp=new Employee(1,"Naveen");
        
        Employee[] empArr=new Employee[1];
        empArr[0]=emp;
        
        Department dept=new Department(1, "Finance", empArr);
        
        System.out.println("Employee Name: "+dept.getEmployees()[0].getName());
        //Changing employee info
        
        Employee emp2=new Employee(2,"Mohandas");
        empArr[0]=emp2;
        System.out.println("Employee Name: "+dept.getEmployees()[0].getName());
        
        emp.setName("Naveen M");
        System.out.println("Employee Name: "+dept.getEmployees()[0].getName());
	}

}
