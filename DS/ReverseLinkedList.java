package com.DS;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> lnklst = new LinkedList<Integer>();
		lnklst.add(1);
		lnklst.add(2);
		lnklst.add(5);
		lnklst.add(3);
		lnklst.add(4);

		for (Integer print : lnklst) {
			System.out.println(print);
		}

		System.out.println("------------");
		Collections.reverse(lnklst);
		for (Integer print : lnklst) {
			System.out.println(print);
		}
	}

}
