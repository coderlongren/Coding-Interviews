package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����9:43:30
* ��˵��: 
*/
public class ��O1ʱ��ɾ������ڵ� {

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
	        if(toDelete.next != null){//ɾ���Ľڵ㲻��β�ڵ�,�����ڽڵ��Ϊ��һ���ڵ㣬��Ϊ����
	            toDelete.val = toDelete.next.val;
	            toDelete.next = toDelete.next.next;
	        }else if(head == toDelete){//����ֻ��һ���ڵ㣬ɾ��ͷ���Ҳ��β�ڵ�
	            head = null;
	        }else{ //ɾ���Ľڵ���β�ڵ�����
	            ListNode node = head;
	            while(node.next != toDelete){//�ҵ������ڶ����ڵ�
	                node = node.next;
	            }
	            node.next = null;
	        }
	    }

}
