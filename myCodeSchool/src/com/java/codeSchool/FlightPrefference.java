package com.java.codeSchool;

public class FlightPrefference implements Comparable<FlightPrefference> {

	private String name;
	private int price;
	private int duration;
	private int time;

	public FlightPrefference(String name, int price, int duration, int time) {
		this.name = name;
		this.price = price;
		this.duration = duration;
		this.time = time;
	}

	/**
	 * Compare a given FlightModel with current(this) object. first compare
	 * price and than duration
	 */
	@Override
	public int compareTo(FlightPrefference flightPrefference) {
		// compare price
		int priceDiff = price - flightPrefference.price;

		if (priceDiff != 0) {
			return priceDiff;
		}
		// price are equals compare duration
		int durationdiff = duration - flightPrefference.duration;

		if (durationdiff != 0) {
			 return durationdiff;
		}

		// price and duration are equals compare time
		return time - flightPrefference.time;

	}

	// for to compare String.
	/* return this.name.toLowerCase().compareTo(mc.name.toLowerCase()); */
	/*
	 * public String toString() { return "NAME :  " + name + " ,price : " +
	 * price + " ,duration : " + duration + " ,time : " + time; }
	 */

	public String toString() {
		return name;
	}

}
