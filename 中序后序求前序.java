package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午11:01:40
* 类说明: 
*/
public class 中序后序求前序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode reConstructBinaryTree(int [] post,int [] in) {
        TreeNode root=reConstruct(post,0,post.length-1,in,0,in.length-1);
        return root;
    }
	public static TreeNode reConstruct(int[] post, int startPost, int endPost, int[] in, int startIn, int endIn) {
		if (startIn > endIn || startPost > endPost) {
			return null;
		}
		// 得到根节点
		TreeNode root = new TreeNode(post[endPost]);
		
		for (int i = startIn; i <= endIn; i++) {
			if (in[i] == post[endPost]) {
				root.left = reConstruct(post, startPost, startPost + i - startIn - 1, in, startIn, i - 1);
				root.right = reConstruct(post, startPost + i - startIn, endPost - 1, in, i + 1, endIn);
			}
		}
		return root;
		
	}


}
