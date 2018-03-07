package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月7日 下午12:47:17
* 类说明:  这次尝试使用 非递归的解法
*/
public class 二叉树第K节点 {
	public static TreeNode KthNode(TreeNode pRoot, int k) {
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode root = pRoot;
		int count = 0;
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			}
			
			else{
				TreeNode temp = stack.pop();
				count++;
				if (count == k) {
					System.out.println(temp.val);
					return null;
				}
				root = temp.right;
				
			}
		}
		return root;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right= new TreeNode(8);
		KthNode(root, 3);
	}
}
