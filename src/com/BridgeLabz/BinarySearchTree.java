package com.BridgeLabz;
public class BinarySearchTree {
	static class Node {    
		int value; 
		Node left, right; 

		Node(int value){ 
			this.value = value; 
			left = null; 
			right = null; 
		} 
	} 
	public void insert(Node node, int value) {
		if (value < node.value) { 
			if (node.left != null) { 
				insert(node.left, value); } 
			else { 
				System.out.println( value + " will be at left of " + node.value); node.left = new Node(value); 
			} 
		} 
		else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println(value + " will be at right of "+node.value);
				node.right = new Node(value);
			}
		}
	}
	public static void main(String args[]) 
	{ 
		BinarySearchTree tree = new BinarySearchTree();
		Node root = new Node(56);
		System.out.println("Root node " + root.value);
		tree.insert(root, 30);
		tree.insert(root, 70);               
	}
}