package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午10:16:49
* 类说明: 如果某二叉树中任意节点的左右子树的深度相差不超过 1，那么它就是一棵平衡二叉树。
*/
public class 平衡二叉树 {
	// 简洁的 解法， 根据求二叉树的高度 得出
	 public boolean IsBalanced(TreeNode root) {
		 if (root == null) {
			 return true;
		 }
		 if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
			 return false;
		 }
		 // 简洁，但是效率不高，因为会重复遍历子节点
		 return IsBalanced(root.left) && IsBalanced(root.right);
		 
	 }
	 public static int getHeight(TreeNode root) {
			if (root == null) {
				return 0;
			}
			return getHeight(root.left) > getHeight(root.right) ? getHeight(root.left) + 1 : getHeight(root.right) + 1; 
	 }
}
