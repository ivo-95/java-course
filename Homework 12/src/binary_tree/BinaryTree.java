package binary_tree;

public class BinaryTree {
	
	private int value, depth;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree() {}
	
	public BinaryTree(int value) {
		setValue(value);
	}
	
	public BinaryTree(int value, BinaryTree left, BinaryTree right) {
		setValue(value);
		setLeft(left);
		setRight(right);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public BinaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTree subtree) {
		if (contains(this, subtree)) {
			throw new IllegalArgumentException("The tree node already exists!");
		}
		left = subtree;
	}
	
	public BinaryTree getRight() {
		return right;
	}
	
	public void setRight(BinaryTree subtree) {
		if (contains(this, subtree)) {
			throw new IllegalArgumentException("The tree node already exists!");
		}
		right = subtree;
	}
	
	public boolean isLeaf() {
		return left == null && right == null;
	}
	
	public boolean contains(BinaryTree root, BinaryTree target) {
		if (root == null || target == null) {
			return false;
		}
		if (target == root) {
			return true;
		}
		return contains(root.getLeft(), target) || contains(root.getRight(), target);
	}
	
	public int getDepth() {
		depth = 0;
		depthHelper(this);
		return depth;
	}
	
	private void depthHelper(BinaryTree node) {
		if (node.getLeft() == null && node.getRight() == null) {
			return;
		} else if (node.getLeft() != null && node.getRight() == null) {
			depth++;
			depthHelper(node.getLeft());
		} else if (node.getRight() != null && node.getLeft() == null) {
			depth++;
			depthHelper(node.getRight());
		} else {
			depth++;
			depthHelper(node.getLeft());
			depthHelper(node.getRight());
		}
	}
}
