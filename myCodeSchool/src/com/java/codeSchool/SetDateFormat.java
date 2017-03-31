package com.java.codeSchool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDateFormat {

	public static void main(String[] args) {

		Long start = System.currentTimeMillis();
		System.out.println("start currentTimeMilis:" + start);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
		System.out.println(sd.format(new Date()));
		sd = new SimpleDateFormat();
		System.out.println(sd.format(new Date()));
		Long end = System.currentTimeMillis();
		System.out.println("end currentTimeMilis:" + end);
		System.out.println("diff : " + (end - start));

	}

}
