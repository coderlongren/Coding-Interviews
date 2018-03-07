package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��6�� ����7:49:06
* ��˵��: ���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
*/
public class ��������ӡ���� {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(pRoot);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0;
		int end = 1; // ʹ�� ������������ʾ�Ƿ� ����δ�ӡ����, ����
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll(); // �Ƴ�ͷ���
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
				end = queue.size(); // endһֱ��ʾ��һ�� һ���ж���Ԫ��
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
