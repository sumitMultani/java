package com.java.codeSchool;

import java.util.Scanner;

public class NumbOfZero {
	public static void main(String[] args) {

		int count =0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		 
		 
		System.out.println(num);
		
		 String d= num+"";
		 System.out.println("length  : "+d.length());
		 for(int i = d.length()-1 ; i > 0 ; i--) {
			 String ch = d.charAt(i)+"";
			 if(ch.equals("0")) {
				 count = count+1;
			 } else {
				 break;
			 }
		 }
		 System.out.println("Count : "+count);
	}

}
