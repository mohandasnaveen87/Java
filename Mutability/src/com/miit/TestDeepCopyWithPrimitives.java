package com.miit;

import java.util.Collections;

final class Stud {  
    private final int id;  
    private final String name;  
    private final int[] marks; 
    
    public Stud(int id, String name, int[] marks) {  
        this.id = id;  
        this.name = name;  
        this.marks = marks.clone(); // deep copy  
        
       // this.marks=marks;
    }  
    
    public int getId() {  
        return id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public int[] getMarks() {  
        return marks.clone(); // deep copy  
    	// return marks;
    	// Collections.unmodifiableCollection(marks);
    }  
}
public class TestDeepCopyWithPrimitives {

	 public static void main(String[] args) {  
	        int[] marks = {80, 85, 90};  
	        Stud s = new Stud(101, "Amit", marks);  
	  
	        marks[0] = 50; // modifying original array  
	        System.out.println(s.getMarks()[0]); // remains unchanged  
	        
	        s.getMarks()[0]=99;
	        System.out.println(s.getMarks()[0]); // remains unchanged  
	        
	    }  
	
}	
 