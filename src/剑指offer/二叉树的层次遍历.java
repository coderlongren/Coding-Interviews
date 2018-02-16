package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��13�� ����7:50:44
* ��˵��: ������һ������������ÿ�δ�ӡ�ڵ��ʱ��Ѵ˽ڵ�������ӽڵ�����ȥ
*/
public class �������Ĳ�α��� {
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
