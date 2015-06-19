package tree3;

public class Tree {

	private int value;
	private Tree left;
	private Tree right;
	
	public Tree(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(Tree root, Tree node) {
		if (node.value < root.value) {
			if (root.left == null) {
				root.left = node;
			} else {
				add(root.left, node);
			}
		} else {
			if (root.right == null) {
				root.right = node;
			} else {
				add(root.right, node);
			}
		}
	}
	
	public void print(Tree node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		print(node.left);
		print(node.right);
	}
}
