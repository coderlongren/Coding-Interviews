package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��5�� ����7:46:19
* ��˵��: 
*/
public class �����л�����ڽ�� {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return null;
		}
		// ��Ҫ���ж��Ƿ��л� 
		ListNode n1 = pHead; // ÿ����һ��
		ListNode n2 = pHead; // ÿ��������
		ListNode n = null; // ��¼n1 n2 �����Ľڵ�
		
		// ʹ��˫ָ�뷨
		while (n2 != null && n2.next != null) {
			n2 = n2.next.next;
			n1 = n1.next;
			if (n1 == n2) {
				n = n1;
				break;
			}
		}
		// ������еĽڵ�����
		int num = 1;
		ListNode temp = n.next;// n�ľ���ڵ�
		
		while (temp != n) {
			temp = temp.next;
			num++;
		}
		ListNode node1 = pHead;
		ListNode node2 = pHead;
		// ��ͼ �����׿���
		// node1 ����num���� Ȼ��������һ���ߣ����ǵ�һ�������ĵط�������ڽڵ�
		for (int i = 0; i < num; i++) {
			node1 = node1.next;
		}
		int num1 = 0;
		
		while (node1 != node2) {
			node1 = node1.next;
			node2 = node2.next;
			num1++;
		}
		
		return node1;
		
	}
}
