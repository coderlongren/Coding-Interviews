package 剑指offer;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午10:14:07
* 类说明: 
*/
public class 二叉树的深度 {
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
