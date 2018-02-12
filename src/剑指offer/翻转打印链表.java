package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午10:39:23
* 类说明: 
*/
public class 翻转打印链表 {
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
	// 使用栈的方法，链表过长时容易栈溢出
	public static ListNode reverseList(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		// 将后面的每一个节点 反向
		head.next.next = head;
		// 把当前节点的next置空
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
            pNext = p.next;// 记录下next
            if (pNext == null) {
                newHead = p;
            }
            p.next = pPre;//翻转一次
            pPre = p;
            p = pNext;//将保存的后面的节点作为下一次循环的p

        }
        return newHead;
	}

}
