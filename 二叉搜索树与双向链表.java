package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月14日 下午1:34:35
* 类说明: 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
* 要求不能创建任何新的结点，只能调整树中结点指针的指向
*/
public class 二叉搜索树与双向链表 {
	// 不能创家任何节点，只能改变其中节点的指向 
	TreeNode head = null;
	TreeNode realHead = null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		Convert(pRootOfTree.left);
		 // 第一次把head指向 最小的元素
		if (head == null) {
			head = pRootOfTree;
			realHead = pRootOfTree;
		}
		else {
			// 最小元素，与他的根节点 双向联系
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		Convert(pRootOfTree.right);
		return realHead;// 最小返回的之最小元素 节点
	}
	// 不使用二叉树的中序遍历 ,非递归方式
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
