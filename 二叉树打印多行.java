package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月6日 下午7:49:06
* 类说明: 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
*/
public class 二叉树打印多行 {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(pRoot);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0;
		int end = 1; // 使用 两个坐标来表示是否 本层次打印完了, 很妙
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll(); // 移除头结点
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
			list.add(temp.val);
			start++;
			if (start == end) {
				res.add(new ArrayList<>(list));
				end = queue.size(); // end一直表示下一层 一共有多少元素
				start = 0;
				list.clear();
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.left.left  =new TreeNode(5);
		root.left.left.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		
		System.out.println(Print(root));
//		System.out.println(IsBalanced(root));
	}
}
