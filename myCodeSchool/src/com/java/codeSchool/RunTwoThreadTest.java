package com.corejavaB;

public class RunTwoThreadTest extends Thread {

	static int click = 0;

	public static void main(String[] args) {

		final RunTwoThreadTest gate = new RunTwoThreadTest();

		Thread t1 = new Thread() {

			public void run() {

				gate.await1();
				// do stuff
			}
		};
		Thread t2 = new Thread() {

			public void run() {

				gate.await2();
				// do stuff
			}
		};

		Thread t3 = new Thread() {

			public void run() {

				gate.await3();
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}

	public synchronized void await1() {

		System.out.println("start :" + System.currentTimeMillis());
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				if (i == 2) {
					System.out.println("click : " + click);
					System.out.println("end :" + System.currentTimeMillis());
					break;
				}
				System.out.println("1st Thread.");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void await2() {

		try {
			for (int i = 11; i <= 20; i++) {
				click++;
				Thread.sleep(1000);
				System.out.println("2nd Thread.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void await3() {

		try {
			for (int i = 21; i <= 30; i++) {
				click++;
				Thread.sleep(1000);
				System.out.println("3rd Thread.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
