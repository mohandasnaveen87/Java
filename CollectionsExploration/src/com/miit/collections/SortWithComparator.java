/**
 * 
 */
package com.miit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */
public class SortWithComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(100,50000,"Naveen"));
		empList.add(new Employee(23,45000,"Tinku"));
		empList.add(new Employee(3500,65000,"Pinku"));
		empList.add(new Employee(4,75000,"Rinku"));
		
		System.out.println("Before sorting :"+empList );
		//Collections.sort(empList,new NameComparator());
		Comparator<Employee> cm1=Comparator.comparing(Employee::getName);  
		Collections.sort(empList,cm1);
		System.out.println("After sorting by name :"+empList );
		
		Comparator<Employee> cm2=Comparator.comparing(Employee::getEmployeeid);  
		Collections.sort(empList,cm2);
		System.out.println("After sorting by id :"+empList );

	}

}
