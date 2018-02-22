package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����10:33:22
* ��˵��: 
*/
public class ƽ�������2 {
	 public static boolean IsBalanced(TreeNode root) {
	        int depth = 0;
	        return IsBalanced(root, depth);
	    }

	    public static boolean IsBalanced(TreeNode root, int depth) {
	        if (root == null) {
	            depth = 0;
	            return true;
	        }

	        int left = 0, right = 0;
	        if (IsBalanced(root.left, left) && IsBalanced(root.right, right)) {
	            int diff = left - right;
	            if (diff <= 1 && diff >= -1) {
	                depth = 1 + (left > right ? left : right);
	                return true;
	            }
	        }

	        return false;
	    }
	    // �����ˣ�
	    public static void main(String[] args) {
	    	TreeNode root = new TreeNode(4);
			root.left = new TreeNode(2);
			root.left.left = new TreeNode(1);
			root.left.left.left  =new TreeNode(5);
			root.left.left.left.left = new TreeNode(3);
			root.left.right = new TreeNode(3);
			root.right = new TreeNode(6);
			System.out.println(IsBalanced(root));
		}
}
