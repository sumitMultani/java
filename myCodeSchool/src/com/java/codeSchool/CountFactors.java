package com.java.codeSchool;

import java.util.Scanner;

public class CountFactors {
	public static void main(String[] args) {
		int count = 0;
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		 System.out.println("ENter Any Number : ");
		 int number = sc.nextInt();
		 
		 for(int i = 1; i <=  number ;i++) {
			 if(number % i == 0) {
				 count = count+1;
			 }
		 }
		 System.out.println("totoal factor : "+count);
	}

}
