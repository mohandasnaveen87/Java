package com.miit;
final class Student {  
    private final int id;  
    private final String name;  
    private final String course;  
  
    public Student(int id, String name, String course) {  
        this.id = id;  
        this.name = name;  
        this.course = course;  
    }  
   
    public int getId() {  
        return id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public String getCourse() {  
        return course;  
    }  
}  
  
public class TestImmutable {  
    public static void main(String[] args) {  
        Student s = new Student(101, "Rahul", "Java");  
        System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse());  
    }  
}  
