package com.java.codeSchool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ContestWinner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer,String> resultMap = new HashMap<Integer,String>();
		Map<Integer, String> map = new TreeMap<Integer, String>();
		System.out.println("Enter number of testcases : ");
		int testCases = sc.nextInt();
		for (int i = 1; i <= testCases; i++) {
			System.out.println("Enter number of Element : ");
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				int id = sc.nextInt();
				String name = sc.next();
				map.put(id, name);
				System.out.println();
			}
		}// for
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry mapentry = (Map.Entry)itr.next();
			if(resultMap.get(mapentry.getKey()) == null) {
				resultMap.put((Integer)mapentry.getKey(),(String) mapentry.getValue());
			}
			else {
				resultMap.put((Integer)mapentry.getKey()+1,(String) mapentry.getValue());
			}
		}//while
		List<String> nameList = new ArrayList<String>(); 
		Set set1 = resultMap.entrySet();
		Iterator itr1 = set.iterator();
		
		while(itr1.hasNext()) {
			Map.Entry mapentry = (Map.Entry)itr1.next();
			nameList.add((String)mapentry.getValue());
		}//while
		Collections.reverse(nameList);
		System.out.println("NAME : "+nameList.get(nameList.size()-1));
		/*for(String name : nameList ) {
			System.out.println("Winner name : "+name);
		}*/
		 
	}

}
