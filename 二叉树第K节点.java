package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����12:47:17
* ��˵��:  ��γ���ʹ�� �ǵݹ�Ľⷨ
*/
public class ��������K�ڵ� {
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
