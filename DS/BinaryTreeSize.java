package com.DS;

//A recursive Java program to calculate the size of the tree

/* Class containing left and right child of current
 node and key value*/
/*class Node
 {
 int data;
 Node left, right;

 public Node(int item)
 {
 data = item;
 left = right = null;
 }
 }*/

/* Class to find size of Binary Tree */
public class BinaryTreeSize {

	Node root;

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	int size() {

		return size(root);
	}

	/* computes number of nodes in tree */
	int size(Node node) {

		
		if (node == null)
			return 0;
		else {
			System.out.println("count");
			return (size(node.left) + 1 + size(node.right));
		}
	}

	public static void main(String args[]) {

		/* creating a binary tree and entering the nodes */
		BinaryTreeSize tree = new BinaryTreeSize();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("The size of binary tree is : " + tree.size());
	}
}
