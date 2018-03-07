package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����10:39:23
* ��˵��: 
*/
public class ��ת��ӡ���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode newhead = reverseList2(head);
		while (newhead != null) {
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
	// ʹ��ջ�ķ������������ʱ����ջ���
	public static ListNode reverseList(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		// �������ÿһ���ڵ� ����
		head.next.next = head;
		// �ѵ�ǰ�ڵ��next�ÿ�
		head.next = null;
		return newHead;
	}
	public static ListNode reverseList2(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode pPre = null;
        ListNode p = head;
        ListNode pNext = head.next;
        ListNode newHead = null;

        while (p != null) {
            pNext = p.next;// ��¼��next
            if (pNext == null) {
                newHead = p;
            }
            p.next = pPre;//��תһ��
            pPre = p;
            p = pNext;//������ĺ���Ľڵ���Ϊ��һ��ѭ����p

        }
        return newHead;
	}

}
