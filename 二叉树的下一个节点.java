package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月5日 下午9:11:53
* 类说明: 1. 如果一个结点有右子树，那么它的下一个结点就是它的右子树的最左子结点
* 		  2. 如果一个结点没有右子树，那么如果它是其父亲的左子结点
* 		  3. 
*/
public class 二叉树的下一个节点 {
	TreeLinkNode GetNext(TreeLinkNode node) {
		if (node.right != null) {
			TreeLinkNode node2 = node.right;
			while (node2.left != null) {
				node2 = node2.left;
			}
			return node2;
		}
		// 如果没有右子树，就去找他的父节点,具体的画图得知
		while (node.parent != null) {
			if (node.parent.left == node) {
				return node.parent;
			}
			node = node.parent;
		}
		return null; // 如果遍历到了根节点 还没找到， 说明是中序遍历最后一个节点，唉 不找了！！！！！
	}
}
