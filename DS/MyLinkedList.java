package com.DS;

/*
 * ---------- LinkedList Insertion ------------
 */
public class MyLinkedList {

	Node head; // head of list

	static class Node {

		int key;

		Node left, right;

		Node(int key) {

			this.key = key;
			left = null;
			right = null;
		}
	}

	/* This function prints contents of linked list starting from head */
	public void printList() {

		Node n = head;
		while (n != null) {
			System.out.print(n.key + " ");
			n = n.right;
		}
	}

	public void deleteByValue(int data) {

		Node temp = head, left = null;
		// if node is header
		if (temp != null && temp.key == data) {
			head = temp.right;
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.key != data) {
			left = temp;
			temp = temp.right;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		left.right = temp.right;
	}

	void deleteNodeByIndex(int position) {

		// If linked list is empty
		if (head == null)
			return;

		// Store head node
		Node temp = head;

		// If head needs to be removed
		if (position == 0) {
			head = temp.right; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.right;

		// If position is more than number of ndoes
		if (temp == null || temp.right == null)
			return;

		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node right = temp.right.right;

		temp.right = right; // Unlink the deleted node from list
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.right = head;
		head = new_node;
	}

	/* Returns count of nodes in linked list */
	public int getCount() {

		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.right;
		}
		return count;
	}

	public static void main(String[] args) {

		/* Start with the empty list. */
		MyLinkedList llist = new MyLinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.right = second; // Link first node with the second node
		second.right = third; // Link second node with the third node
		System.out.println("-----Before Delete --- ");

		// print linked List
		llist.printList();

		// delete from linked list
		llist.deleteByValue(3);

		System.out.println("\n --After Delete --- ");

		// print linked List
		llist.printList();

		// insert new Node in front
		llist.push(12);
		llist.deleteNodeByIndex(1);
		// print linked List

		System.out.println("\n --After Insert new Head --- ");
		llist.printList();

		System.out.println("\nLinkedList size :" + llist.getCount());
	}
}
