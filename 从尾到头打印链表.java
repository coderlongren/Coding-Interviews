package ��ָoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��8�� ����10:04:59
* ��˵��: 
*/
public class ��β��ͷ��ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ʹ�ö�ջ ����ת��ӡ
	public static ArrayList<Integer> printListFromTailToHead(ListNode head) {
		if (head == null) {
			ArrayList<Integer> list = new ArrayList<>();
			return list;
		}
		
		Stack<Integer> stack = new Stack<>();
		while (head != null ) {
			stack.push(head.val);
			head = head.next;
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		while (!stack.isEmpty()) {
			Integer item = stack.pop();
			System.out.println(item); // ��ӡ
			res.add(item);
		}
		
		return res;
	}
	// �ݹ�ķ���
	public static void printListFromTailToHead2(ListNode head) {
		if (head != null) {
			if (head.next != null) {
				printListFromTailToHead2(head.next);
			}
			System.out.println(head.val);
		}
		
	}

}
