package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月7日 下午12:24:16
* 类说明: 给定一颗二叉搜索树，请找出其中的第k大的结点。
* 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
*/
public class 二叉搜索树的第K个节点 {
	public static int index = 0;
	public static ArrayList<Integer> list = new ArrayList<>();
	// 我自己的解法， 就是中序遍历的结果放进数组， 取出第k 个 得了
	public static TreeNode  KthNode(TreeNode pRoot, int k) {
		preOrder(pRoot);
		System.out.print(list.get(k - 1));
		return null;
	}
	public static void preOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			list.add(root.val);
			preOrder(root.right);
		}
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
