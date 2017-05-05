package com.DS;

/* Any node can be a starting point. We can traverse the whole list by starting from any point.
 We just need to stop when the first visited node is visited again.*/

class Link {

	public long data;

	public Link next;

	public Link(long val) {

		data = val;
		next = null;
	}

	public void displayLink() {

		System.out.print(data + " ");
	}

} // end class

public class CircularList {

	Link first;

	Link last;

	public CircularList() {

		first = null;
		last = null;
	}

	public Link find(long key) {

		Link current = first;
		while (current.data != key) {
			current = current.next;
		}
		return current;
	} // end find

	public Link delete() {

		if (first.next == null)
			last = null;
		Link temp = first;
		first = first.next;
		return temp;
	} // end delete

	public boolean isEmpty() {

		return (first == null);
	}

	public void insert(long val) {

		Link newLink = new Link(val);

		if (isEmpty())
			last = newLink;

		newLink.next = first;
		first = newLink;
		last.next = first;
	} // end insert

	public void displayAmount(int n) {

		Link current = first;
		while (n > 0) {
			current.displayLink();
			current = current.next;
			n--;
		}
		System.out.println("");
	} // end displayAmount

	public static void main(String[] args) {

		CircularList cl = new CircularList();

		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);

		cl.displayAmount(4);

		//cl.delete();

		cl.displayAmount(6);

	}
} // end class
