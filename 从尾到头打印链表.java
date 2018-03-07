package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午10:04:59
* 类说明: 
*/
public class 从尾到头打印链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 使用堆栈 来逆转打印
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
			System.out.println(item); // 打印
			res.add(item);
		}
		
		return res;
	}
	// 递归的方法
	public static void printListFromTailToHead2(ListNode head) {
		if (head != null) {
			if (head.next != null) {
				printListFromTailToHead2(head.next);
			}
			System.out.println(head.val);
		}
		
	}

}
