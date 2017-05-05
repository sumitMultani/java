package com.corejavaB;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestSize {
	
	public static void main(String[] args) {

		HashMap<Student,Integer> map = new HashMap<Student,Integer>();
		map.put(new Student(1,"narainagrh"), 1);
		map.put(new Student(1,"narainagrh"), 1);
		System.out.println(map.size());
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println("Key : "+mapEntry.getKey()+" , Value : "+mapEntry.getValue());
			Student st = (Student) mapEntry.getKey();
			System.out.println(st.getName());
		}
		
		
		/*TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(null);*/
		 
	}

}
