package com.java8;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Driver implements SmallVehicle, BigVechicle {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		try {
			obj.put("name", "mkyong.com");
			obj.put("age", new Integer(100));
			JSONArray list = new JSONArray();

			obj.put("messages", list);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		System.out.println(obj);
		Driver driver = new Driver();
		driver.add();
		driver.print();
		SmallVehicle.blowHorn();

	}

	@Override
	public void add() {

		System.out.println(5 + 5);

	}

	@Override
	public void run() {

		
	}

}
