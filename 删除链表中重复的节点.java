package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��5�� ����8:16:53
* ��˵��: 
* ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬
* �ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
*/
public class ɾ���������ظ��Ľڵ� {
	 public static ListNode deleteDuplication(ListNode pHead) {
		 
		 // ��Ϊ���ܵ�һ���ڵ�����ظ��Ľڵ�,�����Ҫ���½���һ���µĽڵ�
		 if (pHead == null) {
			 return null;
		 }
		 ListNode preNode = pHead;
		 ListNode node = pHead;
		 
		 while (node != null) {
			 ListNode next = node.next;
			 boolean needDelete = false; // �ж����������ڵ��Ƿ����� 
			 if (next != null && next.val == node.val) {
				 needDelete = true;
			 }
			 
			 // ������
			 if (!needDelete) {
				 preNode = node;
				 node = node.next;
			 }
			 // ������
			 else {
				 int val = node.val;
				 ListNode toBeDel = node;// ��Ҫɾ���Ľڵ�
				 
				 while (toBeDel != null && toBeDel.next.val == val) {
					 next = toBeDel.next;
					 toBeDel = next;
					 // Ҫ���� ��һ���ڵ��Ƿ��ظ�
					 if (preNode == null ) {
						 pHead = next;
					 }
					 else {
						 preNode.next = next;
					 }
					 node = next;
				 }
			 }
			 
		 }
		return pHead;
	 }
	 public static void main(String[] args) {
		ListNode pHead = new ListNode(1);
		pHead.next = new ListNode(5);
		pHead.next.next = new ListNode(5);
		pHead.next.next.next = new ListNode(2);
		pHead.next.next.next.next = new ListNode(3);
		
		
		ListNode test = deleteDuplication(pHead);
		System.out.println(test.next.next.val);
//		System.out.println(te);
//		test.next = new ListNode(3);
//		System.out.println(pHead.next.val);
	}
}
