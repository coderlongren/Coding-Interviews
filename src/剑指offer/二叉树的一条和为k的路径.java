package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月14日 上午11:40:30
* 类说明: 
*/
public class 二叉树的一条和为k的路径 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		findTarget(root,target,stack, list);
		return list;
	}

	private static void findTarget(TreeNode root, int target, Stack<TreeNode> stack,
			ArrayList<ArrayList<Integer>> list) {
		
		if (root == null) {
			return ;
		}
		if (root.left == null && root.right == null) {
			// 到达了叶子节点
			stack.push(root);
			if (target == root.val) {
				//如果这是一条有效的路径,
				ArrayList<Integer> res = new ArrayList<>();
				for (TreeNode node : stack) {
					res.add(node.val);
				}
				list.add(res);
			}
			stack.pop();
		}
		else {
			stack.push(root);
			findTarget(root.left, target - root.val, stack, list);
			findTarget(root.right, target-root.val, stack, list);
			stack.pop();
		}
		
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(9);
		System.out.println(FindPath(root, 15));
	}
}
