package binary_tree;

public class Tester {

	public static void main(String[] args) {
		BinaryTree root = new BinaryTree(0);
		BinaryTree node1 = new BinaryTree(1);
		BinaryTree node2 = new BinaryTree(2);
		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(4);
		BinaryTree node5 = new BinaryTree(5);
		BinaryTree node6 = new BinaryTree(6);
		root.setLeft(node1);
		node1.setRight(node2);
		node2.setLeft(node3);
		node3.setRight(node4);
		node4.setLeft(node5);
		node5.setRight(node6);
		System.out.println(node2.getDepth());
	}
}
