package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��5�� ����9:11:53
* ��˵��: 1. ���һ�����������������ô������һ�������������������������ӽ��
* 		  2. ���һ�����û������������ô��������丸�׵����ӽ��
* 		  3. 
*/
public class ����������һ���ڵ� {
	TreeLinkNode GetNext(TreeLinkNode node) {
		if (node.right != null) {
			TreeLinkNode node2 = node.right;
			while (node2.left != null) {
				node2 = node2.left;
			}
			return node2;
		}
		// ���û������������ȥ�����ĸ��ڵ�,����Ļ�ͼ��֪
		while (node.parent != null) {
			if (node.parent.left == node) {
				return node.parent;
			}
			node = node.parent;
		}
		return null; // ����������˸��ڵ� ��û�ҵ��� ˵��������������һ���ڵ㣬�� �����ˣ���������
	}
}
