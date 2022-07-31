package com.BridgeLabz;
public class BinarySearchTree {
	Node root;
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	// Constructor
	BinarySearchTree() { 
		root = null; 
	}

	BinarySearchTree(int value) { 
		root = new Node(value); 
	}
	public void insert(int key) { root = insertRec(root, key); }
	public Node insertRec(Node root, int key){
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	public void inorder() { 
		inorderRec(root); 
	}

	public void inorderRec(Node root){
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	public Node search(Node root, int key) {
		// Case 1 : root is null or key is present at root
		if (root==null){
			System.out.println("Not found in tree");
			return root;
		}
		if (root.key==key){
			System.out.println("Found 63 in tree");
			return root;
		}
		if (root.key < key){
			return search(root.right, key);
		}
		return search(root.left, key);
	}
}