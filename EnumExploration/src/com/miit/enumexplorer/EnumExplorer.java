package com.miit.enumexplorer;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumExplorer {
	
	
	public static void main(String[] args) {
	
		DaysOfWeek day=DaysOfWeek.MON;
		
		String output=switch(day) {
		
		case SAT,SUN ->"Weekend";
		
		default ->"Weekday";
		};
		
		System.out.println(output);
		
		EnumMap<DaysOfWeek,String> activitiesMap=new EnumMap<DaysOfWeek,String>(DaysOfWeek.class);
		activitiesMap.put(DaysOfWeek.MON, "Meet 1");
		activitiesMap.put(DaysOfWeek.TUE, "Meet 2");
		activitiesMap.put(DaysOfWeek.WED, "Meet 3");
		
		
		for(Entry<DaysOfWeek,String> entry:activitiesMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
}
