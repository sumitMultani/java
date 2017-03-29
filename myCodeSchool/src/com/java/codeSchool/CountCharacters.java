package com.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacters {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String str = "my name is sumit";
		int val = 1;
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i <= str.length() - 1; i++) {
			String scahr = str.charAt(i) + "";
			// System.out.println(map.containsKey(scahr));
			if (!scahr.equals(" ")) {
				if (!map.containsKey(scahr)) {
					map.put(scahr, val);
				} else {
					Integer newVal = map.get(scahr);
					map.put(scahr, newVal + 1);
				}
			}
		}

		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());

		}

		// String str = "the value of object";

	}
}
