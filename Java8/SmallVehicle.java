package com.java8;

//@FunctionalInterface
public abstract interface SmallVehicle extends Runnable {

	public static void blowHorn() {

		System.out.println("[SmallVehicle] : static Blowing horn!!!");
	}

	default void print() {

		System.out.println("[SmallVehicle] : I am a default vehicle!");
	}

	public abstract void add();
}
