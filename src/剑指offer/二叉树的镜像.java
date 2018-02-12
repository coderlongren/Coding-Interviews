package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午11:08:25
* 类说明:  可以采用递归方式，或者堆栈(先入后出的特点)
*/
public class 二叉树的镜像 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 简单易想到的递归
	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		// 重点在这一步,只要有儿子节点，就要执行左右儿子节点交换
		if (root.left != null || root.right != null) {
			// 创建临时节点，接着在交换
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			Mirror(root.left);
			Mirror(root.right);
		}
	}
	// 用栈结构，将节点依次入栈，每个入栈的节点都镜像他的子节点
	public void Mirror2(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop(); // 
			
			if (node.left != null || node.right != null) {
				TreeNode temp = node.left;
				node.left = node.right;
				node.right = temp;
			}
			
			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}
		}
	}
}
