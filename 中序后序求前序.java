package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��8�� ����11:01:40
* ��˵��: 
*/
public class ���������ǰ�� {

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
		// �õ����ڵ�
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
