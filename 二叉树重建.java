package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午10:50:03
* 类说明: 
*/
public class 二叉树重建 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		// 前序遍历{1,2,4,7,3,5,6,8}
		// 中序遍历 {4,7,2,1,5,3,8,6}
		TreeNode root =  reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}
	public static TreeNode reConstruct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		// 如果起始坐标大于结束下标， 无效的输入
		if (startPre > endPre || startIn > endIn) {
			return null; // 无效
		}
		
		TreeNode root = new TreeNode(pre[0]);// 前序遍历第一个数，即根节点
		
		for(int i = startIn; i <= endIn; i++) {
			// 在中序遍历中找到 中根节点
			if (in[i] == pre[startPre]) {
				//i-startIn是左子树节点的个数，前序遍历起始值加上这个就是终点值
                //i-1就是中序遍历左子树的终点，起始值是从0一直都是从0开始
				root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				//前序右子树遍历的起始值:startPre+i-startIn+1 前序右子树遍历的终点值:endPre
                //中序遍历右子树的起始值:i+1,endIn
				root.right = reConstruct(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
			}
		}
		return root;
	}

}
