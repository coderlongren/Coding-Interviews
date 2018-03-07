package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月5日 下午9:31:19
* 类说明: 
*/
public class 对称的二叉树 {
	// 如果 让我第一次按我的思路来做的话， 肯定会先求出这棵树的镜像树， 再来比较他们
	// 当然 下面的递归 和 求镜像二叉树是差不多的
	 boolean isSymmetrical(TreeNode pRoot) { 
		 return isSymmetrical1(pRoot,pRoot);
	 }

	public static boolean isSymmetrical1(TreeNode pRoot, TreeNode pRoot2) {
		if (pRoot == null && pRoot2 == null) {
			// 共同到达了叶子节点
			return true;
		}
		if (pRoot == null || pRoot2 == null) {
			// 如果有一方到达叶子节点，而另一方没有到达，肯定不对称
			return false;
		}
		// 还需要判断value是否相等
		if (pRoot.val != pRoot2.val) {
			return false;
		}
		
		return isSymmetrical1(pRoot.left, pRoot2.right) && isSymmetrical1(pRoot.right, pRoot2.left);
		
	}
}
