package com.corejavaB;

public class TestThread extends Thread {

	public static void main(String[] args) {

		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();

		t1.test1();
		t2.test2();

	}

	public void test1() {

		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println("i : " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test2() {

		try {
			for (int i = 11; i <= 20; i++) {
				Thread.sleep(1000);
				System.out.println("i : " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
