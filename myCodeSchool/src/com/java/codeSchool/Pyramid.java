package com.corejavaB;

public class Pyramid {

	public static void main(String[] args) {
		 
		int count = 0;
		for (int i = 5; i >= 1; i--) {
			/*for (int k = 0; k <= count; k++) {
				System.out.print(" ");
			}*/
			while(count > 0){
				System.out.print(" ");
				count-- ;
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
			count = (5-i)+1;
			 
		}
	}

}
