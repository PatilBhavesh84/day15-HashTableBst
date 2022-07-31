package com.BridgeLabz;

public class Main {
	public static void main(String[] args) {	
		BinarySearchTree tree = new BinarySearchTree();

		//root
		tree.insert(56);
		//edge		
		tree.insert(30);
		tree.insert(70);
		//siblings
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		//parent
		tree.insert(11);
		tree.insert(65);
		//child
		tree.insert(3);
		tree.insert(16);
		//leaf node
		tree.insert(63);
		tree.insert(67);

		tree.search(tree.root,63);
	}
}

