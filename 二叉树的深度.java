package ��ָoffer;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����10:14:07
* ��˵��: 
*/
public class ����������� {
	public static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return getHeight(root.left) > getHeight(root.right) ? getHeight(root.left) + 1 : getHeight(root.right) + 1; 
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		System.out.println(getHeight(root));
	}
}
