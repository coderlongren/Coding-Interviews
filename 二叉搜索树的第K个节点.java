package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����12:24:16
* ��˵��: ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
* ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
*/
public class �����������ĵ�K���ڵ� {
	public static int index = 0;
	public static ArrayList<Integer> list = new ArrayList<>();
	// ���Լ��Ľⷨ�� ������������Ľ���Ž����飬 ȡ����k �� ����
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
