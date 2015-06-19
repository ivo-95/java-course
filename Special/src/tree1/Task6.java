package tree1;

import java.util.LinkedList;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		{
			TreeNode node2 = root.addChild(2);
			{
				TreeNode node5 = node2.addChild(5);
				TreeNode node6 = node2.addChild(6);
				TreeNode node7 = node2.addChild(7);
			}
			TreeNode node3 = root.addChild(3);
			TreeNode node4 = root.addChild(4);
			{
				TreeNode node8 = node4.addChild(8);
				TreeNode node9 = node4.addChild(9);
			}
		}
		
		//root.print(root, 0);
		root.dfs(root);
	}
}

class TreeNode {
	
	private int value;
	TreeNode parent;
	List<TreeNode> children;
	
	public TreeNode(int value) {
		this.value = value;
		this.children = new LinkedList<TreeNode>();
	}
	
	public TreeNode addChild(int value) {
		TreeNode childNode = new TreeNode(value);
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}
	
	public void print(TreeNode node, int depth) {
		for (int i = 0; i < depth; i++) {
    	  	System.out.print("\t");	
		}
		System.out.println(node.value);
		depth++;
		
		for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
		}
	}
	
	public void dfs(TreeNode node) {
		if (node.children.size() == 0) {
			System.out.print(node.value + " ");
			return;
		}
		for (int i = 0; i < node.children.size(); i++) {
			dfs(node.children.get(i));
		}
		System.out.print(node.value + " ");
	}
}
