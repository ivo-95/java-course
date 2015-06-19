package tree3;

public class Tester {

	public static void main(String[] args) {
		Tree root = new Tree(8);
		Tree node3 = new Tree(3);
		Tree node10 = new Tree(10);
		Tree node1 = new Tree(1);
		Tree node6 = new Tree(6);
		Tree node4 = new Tree(4);
		Tree node7 = new Tree(7);
		Tree node13 = new Tree(13);
		Tree node14 = new Tree(14);
		root.add(root, node3);
		root.add(root, node10);
		root.add(root, node1);
		root.add(root, node6);
		root.add(root, node7);
		root.add(root, node4);
		root.add(root, node14);
		root.add(root, node13);
		
		root.print(root);
	}

}
