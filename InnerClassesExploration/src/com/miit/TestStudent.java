package com.miit;

class Student {

	private String name,id;
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+" id: "+id;
	}
	class Address{
		
	private	String city,pincode;
		public Address(String city, String pincode) {
			super();
			this.city = city;
			this.pincode = pincode;
		}
		
		public void display() {
			System.out.println("City: "+city+ " Pincode: "+pincode+" Name:"+name);
		}
	}
}

public class TestStudent{
	
	public static void main(String[] args) {
		
		Student student=new Student("Naveen","87");
		System.out.println(student);
		
		Student.Address address=student.new Address("London","1E2");
		address.display();
	   //System.out.println(address.);
}
}