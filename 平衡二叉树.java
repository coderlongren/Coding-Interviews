package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����10:16:49
* ��˵��: ���ĳ������������ڵ��������������������� 1����ô������һ��ƽ���������
*/
public class ƽ������� {
	// ���� �ⷨ�� ������������ĸ߶� �ó�
	 public boolean IsBalanced(TreeNode root) {
		 if (root == null) {
			 return true;
		 }
		 if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
			 return false;
		 }
		 // ��࣬����Ч�ʲ��ߣ���Ϊ���ظ������ӽڵ�
		 return IsBalanced(root.left) && IsBalanced(root.right);
		 
	 }
	 public static int getHeight(TreeNode root) {
			if (root == null) {
				return 0;
			}
			return getHeight(root.left) > getHeight(root.right) ? getHeight(root.left) + 1 : getHeight(root.right) + 1; 
	 }
}
