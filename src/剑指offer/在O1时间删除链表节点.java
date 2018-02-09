package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午9:43:30
* 类说明: 
*/
public class 在O1时间删除链表节点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		delete(head, head.next);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	 public static void delete(ListNode head, ListNode toDelete){
	        if(toDelete == null){
	            return ;
	        }
	        if(toDelete.next != null){//删除的节点不是尾节点,让现在节点变为下一个节点，最为精妙
	            toDelete.val = toDelete.next.val;
	            toDelete.next = toDelete.next.next;
	        }else if(head == toDelete){//链表只有一个节点，删除头结点也是尾节点
	            head = null;
	        }else{ //删除的节点是尾节点的情况
	            ListNode node = head;
	            while(node.next != toDelete){//找到倒数第二个节点
	                node = node.next;
	            }
	            node.next = null;
	        }
	    }

}
