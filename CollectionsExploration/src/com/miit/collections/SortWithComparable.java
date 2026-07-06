/**
 * 
 */
package com.miit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class SortWithComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,50000,"Naveen"));
		empList.add(new Employee(2,45000,"Tinku"));
		empList.add(new Employee(3,65000,"Pinku"));
		empList.add(new Employee(4,75000,"Rinku"));
		
		System.out.println("Before sorting :"+empList );
		Collections.sort(empList);
		
		System.out.println("After sorting :"+empList );
		
	}

}
