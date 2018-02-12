package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午10:51:29
* 类说明: 
*/
public class 树的子结构 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// root2 是不是root1的一个子树
	public boolean HasSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return false;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		boolean res = false; // 如果后面不成功，直接返回res
		// 根节点相同，则比较
		if (root1.val == root2.val) {
			res = isSubTree(root1, root2);
		}
		// 根节点不同，递归比较
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
