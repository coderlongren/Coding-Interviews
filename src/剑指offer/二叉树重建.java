package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��8�� ����10:50:03
* ��˵��: 
*/
public class �������ؽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		// ǰ�����{1,2,4,7,3,5,6,8}
		// ������� {4,7,2,1,5,3,8,6}
		TreeNode root =  reConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}
	public static TreeNode reConstruct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		// �����ʼ������ڽ����±꣬ ��Ч������
		if (startPre > endPre || startIn > endIn) {
			return null; // ��Ч
		}
		
		TreeNode root = new TreeNode(pre[0]);// ǰ�������һ�����������ڵ�
		
		for(int i = startIn; i <= endIn; i++) {
			// ������������ҵ� �и��ڵ�
			if (in[i] == pre[startPre]) {
				//i-startIn���������ڵ�ĸ�����ǰ�������ʼֵ������������յ�ֵ
                //i-1��������������������յ㣬��ʼֵ�Ǵ�0һֱ���Ǵ�0��ʼ
				root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				//ǰ����������������ʼֵ:startPre+i-startIn+1 ǰ���������������յ�ֵ:endPre
                //�����������������ʼֵ:i+1,endIn
				root.right = reConstruct(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
			}
		}
		return root;
	}

}
