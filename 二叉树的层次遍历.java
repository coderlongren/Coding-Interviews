package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月13日 下午7:50:44
* 类说明: 可以用一个队列容器，每次打印节点的时候把此节点的左右子节点加入进去
*/
public class 二叉树的层次遍历 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
			list.add(temp.val);
		}
		return list;
	}
}
