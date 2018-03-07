package 剑指offer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月14日 下午12:06:26
* 类说明: 
*/


/* 随机指针
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class 复杂链表的复制 {
	//方法一：用hashMap映射原链表，牺牲O（N）空间换来时间
	public static RandomListNode Clone(RandomListNode pHead){
		if (pHead == null) {
			return null;
		}
		
		RandomListNode newHead = new RandomListNode(pHead.label);
		RandomListNode pre = pHead;
		RandomListNode newPre = newHead;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		map.put(pre, newPre); // 头结点全都进入
		
		// 处理所有next节点
		while (pre.next != null) {
			newPre.next = new RandomListNode(pre.next.label);
			pre = pre.next;
			newPre = newPre.next;
			map.put(newPre, pre);
		}
		
		// 处理所有random节点
		pre = pHead;
		newPre = newHead;
		
		while (newPre != null) {
			newPre.randomListNode  = map.get(pre.randomListNode);
			newPre = newPre.next;
			pre = pre.next;
			
		}
		
		
		return newHead;
	}
	
	public static void main(String[] args) {
		RandomListNode head = new RandomListNode(1);
		head.next = new RandomListNode(2);
		head.next.next = new RandomListNode(3);
		head.randomListNode = head.next.next;
		head.next.randomListNode = head;
		head.next.next.randomListNode = head.next;
		
		RandomListNode newHead = Clone(head);
		System.out.println(head == newHead);
		System.out.println(head.next == newHead.next);
		System.out.println(head.randomListNode == newHead.randomListNode);
	}
}
