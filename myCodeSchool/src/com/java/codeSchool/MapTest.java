package com.corejavaB;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kk1");
		map.put(2, "kk2");
		map.put(3, "kk3");
		map.put(4, "kk4");
		map.put(5, "kk5");

		if (map.containsKey(6)) {
			map.put(5, "upadted");
			map.replace(1, "value");
		}

		if (map.containsValue("upadted") || map.containsValue("kk5")) {
			map.remove(5);
		}

		if (map != null && !map.isEmpty()) {

			Set<Integer> keySet2 = map.keySet();
			if (keySet2 != null && !keySet2.isEmpty()) {

				Iterator<Integer> itr2 = keySet2.iterator();

				if (itr2 != null) {
					while (itr2.hasNext()) {
						Integer key = itr2.next();
						if (key != 3) {
							System.out.println("KEY : " + key);
							System.out.println("Value : " + map.get(key));
						}
					}
				}
			}

			System.out.println("\n-oo-oo-oo-oo-oo-\n");

			Set<Entry<Integer, String>> set = map.entrySet();
			Iterator<Entry<Integer, String>> itr = set.iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, String> mapEntry = (Map.Entry<Integer, String>) itr
						.next();
				System.out.println("Key : " + mapEntry.getKey() + " ,Value : "
						+ mapEntry.getValue());
			}

			// map.clear();
			if (map.isEmpty())
				System.out.println(" the linked hash Map is empty");
			else
				System.out.println("the hash Map is not empty");

		}
	}
}
