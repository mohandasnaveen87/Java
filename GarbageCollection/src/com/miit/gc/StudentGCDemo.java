package com.miit.gc;
class Student {  
  
    int rollNo;  
    String name;  
  
    Student(int rollNo, String name) {  
        this.rollNo = rollNo;  
        this.name = name;  
    }  
    protected void finalize() {  
        System.out.println("Student object is garbage collected");  
    }  
}  
  
public class StudentGCDemo {  
  
    public static void main(String[] args) {  
  
        Student s1 = new Student(1, "Rahul");  
        Student s2 = new Student(2, "Anita");  
  
        // Student objects are no longer needed  
        s1 = null;  
        s2 = null;  
  
        // Requesting garbage collection  
        System.gc();  
    }  
}  