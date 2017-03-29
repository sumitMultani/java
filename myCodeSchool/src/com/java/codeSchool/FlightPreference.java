package com.java.codeSchool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightPreference {

	public static void main(String[] args) {

		/*// sorting object array
		FlightPrefference[] flightModel = new FlightPrefference[5];

		flightModel[0] = new FlightPrefference("dk1", 1000, 125, 10);
		flightModel[1] = new FlightPrefference("dk2", 1800, 129, 9);
		flightModel[2] = new FlightPrefference("dk3", 1000, 315, 7);
		flightModel[3] = new FlightPrefference("dk4", 1800, 129, 5);
		flightModel[4] = new FlightPrefference("dk4", 800, 129, 5);
		// sorting employees array using Comparable interface implementation
		Arrays.sort(flightModel);
		System.out.println("Default Sorting of FlightPrefference list:\n"
				+ Arrays.toString(flightModel));*/
		FlightPrefference flP1 = new FlightPrefference("dk1", 8000, 233, 6);
		FlightPrefference flP2 = new FlightPrefference("dk2", 8000, 32, 1);
		FlightPrefference flP3 = new FlightPrefference("dk3", 100, 155, 4);
		FlightPrefference flP4 = new FlightPrefference("dk4", 7000, 111, 7);
		List<FlightPrefference> list = new ArrayList<FlightPrefference>();
		 
		list.add(flP1);
		list.add(flP2);
		list.add(flP3);
		list.add(flP4);
		
		FlightPrefference[] stockArr = new FlightPrefference[list.size()];
		stockArr = list.toArray(stockArr);

		//FlightPrefference[] stockArr = (FlightPrefference[]) list.toArray();
		Arrays.sort(stockArr);
		System.out.println("Default Sorting of FlightPrefference list:\n"
				+ Arrays.toString(stockArr));
		
		
		System.out.println("first lessPrice Obj : { "+stockArr[0] +" }");

	}
}
