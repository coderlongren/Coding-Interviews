package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��5�� ����9:31:19
* ��˵��: 
*/
public class �ԳƵĶ����� {
	// ��� ���ҵ�һ�ΰ��ҵ�˼·�����Ļ��� �϶��������������ľ������� �����Ƚ�����
	// ��Ȼ ����ĵݹ� �� ����������ǲ���
	 boolean isSymmetrical(TreeNode pRoot) { 
		 return isSymmetrical1(pRoot,pRoot);
	 }

	public static boolean isSymmetrical1(TreeNode pRoot, TreeNode pRoot2) {
		if (pRoot == null && pRoot2 == null) {
			// ��ͬ������Ҷ�ӽڵ�
			return true;
		}
		if (pRoot == null || pRoot2 == null) {
			// �����һ������Ҷ�ӽڵ㣬����һ��û�е���϶����Գ�
			return false;
		}
		// ����Ҫ�ж�value�Ƿ����
		if (pRoot.val != pRoot2.val) {
			return false;
		}
		
		return isSymmetrical1(pRoot.left, pRoot2.right) && isSymmetrical1(pRoot.right, pRoot2.left);
		
	}
}
