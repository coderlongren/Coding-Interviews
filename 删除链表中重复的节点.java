package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月5日 下午8:16:53
* 类说明: 
* 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
* 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/
public class 删除链表中重复的节点 {
	 public static ListNode deleteDuplication(ListNode pHead) {
		 
		 // 因为可能第一个节点就是重复的节点,因此需要重新建立一个新的节点
		 if (pHead == null) {
			 return null;
		 }
		 ListNode preNode = pHead;
		 ListNode node = pHead;
		 
		 while (node != null) {
			 ListNode next = node.next;
			 boolean needDelete = false; // 判断相邻两个节点是否相邻 
			 if (next != null && next.val == node.val) {
				 needDelete = true;
			 }
			 
			 // 不相邻
			 if (!needDelete) {
				 preNode = node;
				 node = node.next;
			 }
			 // 相邻了
			 else {
				 int val = node.val;
				 ListNode toBeDel = node;// 将要删除的节点
				 
				 while (toBeDel != null && toBeDel.next.val == val) {
					 next = toBeDel.next;
					 toBeDel = next;
					 // 要考虑 第一个节点是否重复
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
