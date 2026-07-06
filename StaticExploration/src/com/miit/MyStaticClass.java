package com.miit;

public class MyStaticClass {

	private int count=13;
	private static  int row=0;
	
	public  int increment() {
	      row=row+1;
		return count++;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStaticClass obj1 =new MyStaticClass();
		System.out.println("count :"+obj1.increment());
		
		MyStaticClass obj2 =new MyStaticClass();
		
		System.out.println("count :"+obj2.increment());
		System.out.println("Row: "+row);
	}

}
