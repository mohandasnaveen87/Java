package com.miit;

import java.util.Scanner;

public class ReverseString {
	

		public static void main(String[] args) {
			
			//System.out.println("Enter your name\n");
		//	Scanner scn=new Scanner(System.in);
			
			//String st1=scn.nextLine();
			String st1=args[0]+args[1]+args[2];
			StringBuilder st2 = new StringBuilder();
			for(int i=st1.length()-1;i>=0;i--) {
				
				st2.append(st1.charAt(i));
			}
			System.out.println("Your reversed name is "+st2);
			
			//String env = System.getProperty("env");
	        
	        // Read a built-in system argument provided automatically by the OS/JVM
	        String osName = System.getProperty("os.name");
	        String javaVersion = System.getProperty("java.version");

	       // System.out.println("Runtime Environment: " + env);
	        System.out.println("Operating System: " + osName);
	        System.out.println("Java Version: " + javaVersion);
		}
}
