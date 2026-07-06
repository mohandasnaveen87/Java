package com.miit.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileExplore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  FileReader reader = null;
		try {
			reader = new FileReader("application.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    System.out.println(p.getProperty("spring.application.name"));  
		    System.out.println(p.getProperty("eureka.client.service-url.defaultZone"));  
	}

}
