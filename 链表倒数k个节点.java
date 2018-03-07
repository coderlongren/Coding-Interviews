package 剑指offer;

import java.security.acl.LastOwnerException;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午10:31:24
* 类说明: 
*/
public class 链表倒数k个节点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 双指针法，两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，
	// 到达第k个节点。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		ListNode pre = head;
		ListNode last = head;
		
		// 移动 k-1 步， 因为第一次就在第一个节点了, 移动之后到达第K个节点
		for (int i = 1; i < k; i++) {
			if (pre.next != null) {
				pre = pre.next;
			}
			// k 不满足条件
			else {
				return null;
			}
		}
		
		while (pre.next != null) {
			pre = pre.next;
			last = last.next;
		}
		return last;
	}

}
