package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����11:08:25
* ��˵��:  ���Բ��õݹ鷽ʽ�����߶�ջ(���������ص�)
*/
public class �������ľ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// �����뵽�ĵݹ�
	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		// �ص�����һ��,ֻҪ�ж��ӽڵ㣬��Ҫִ�����Ҷ��ӽڵ㽻��
		if (root.left != null || root.right != null) {
			// ������ʱ�ڵ㣬�����ڽ���
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			Mirror(root.left);
			Mirror(root.right);
		}
	}
	// ��ջ�ṹ�����ڵ�������ջ��ÿ����ջ�Ľڵ㶼���������ӽڵ�
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
