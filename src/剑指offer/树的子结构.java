package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����10:51:29
* ��˵��: 
*/
public class �����ӽṹ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// root2 �ǲ���root1��һ������
	public boolean HasSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return false;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		boolean res = false; // ������治�ɹ���ֱ�ӷ���res
		// ���ڵ���ͬ����Ƚ�
		if (root1.val == root2.val) {
			res = isSubTree(root1, root2);
		}
		// ���ڵ㲻ͬ���ݹ�Ƚ�
		if (!res) {
			res = HasSubTree(root1.left, root2);
		}
		if (!res) {
			res = HasSubTree(root1.right, root2);
		}
		return res;
		
	}
	private boolean isSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return false;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		if (root1.val == root1.val) {
			return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
		}
		return false;
	}

}
