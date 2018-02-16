package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��14�� ����1:34:35
* ��˵��: ����һ�ö��������������ö���������ת����һ�������˫������
* Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
*/
public class ������������˫������ {
	// ���ܴ����κνڵ㣬ֻ�ܸı����нڵ��ָ�� 
	TreeNode head = null;
	TreeNode realHead = null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		Convert(pRootOfTree.left);
		 // ��һ�ΰ�headָ�� ��С��Ԫ��
		if (head == null) {
			head = pRootOfTree;
			realHead = pRootOfTree;
		}
		else {
			// ��СԪ�أ������ĸ��ڵ� ˫����ϵ
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		Convert(pRootOfTree.right);
		return realHead;// ��С���ص�֮��СԪ�� �ڵ�
	}
	// ��ʹ�ö�������������� ,�ǵݹ鷽ʽ
	public TreeNode Convert2(TreeNode pRootOfTree) {
		if(pRootOfTree == null) return pRootOfTree;

        TreeNode list = null;
        Stack<TreeNode> s = new Stack<>();
        while(pRootOfTree != null || !s.isEmpty()){
            if(pRootOfTree != null) {
                s.push(pRootOfTree);
                pRootOfTree = pRootOfTree.right;
            } else {
                pRootOfTree = s.pop();
                if(list == null)
                    list = pRootOfTree;
                else {
                    list.left = pRootOfTree;
                    pRootOfTree.right = list;
                    list = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.left;
            }
        }

        return list;
	}
}
