package com.miit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneralOperations {

	
public static void main(String[] args) {
		
		
	
	List<String> list1=new ArrayList<String>(Arrays.asList("a","z","d"));
	
	Collections.addAll(list1, "u");
	
	System.out.println("List1: "+list1);
	
	List<String> list2=new ArrayList<String>(Arrays.asList("X"));
	
	Collections.copy(list1, list2);
	
	System.out.println("After copy List1: "+list1);
	
	Collections.sort(list1);
	
	System.out.println("After sorting asc: "+list1);
	
	Collections.sort(list1,Collections.reverseOrder());
	
	System.out.println("After sorting desc: "+list1);
	
	
	
	
	
	
	
	
	}

}
