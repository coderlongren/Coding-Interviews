package ��ָoffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��14�� ����12:06:26
* ��˵��: 
*/


/* ���ָ��
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class ��������ĸ��� {
	//����һ����hashMapӳ��ԭ��������O��N���ռ任��ʱ��
	public static RandomListNode Clone(RandomListNode pHead){
		if (pHead == null) {
			return null;
		}
		
		RandomListNode newHead = new RandomListNode(pHead.label);
		RandomListNode pre = pHead;
		RandomListNode newPre = newHead;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		map.put(pre, newPre); // ͷ���ȫ������
		
		// ��������next�ڵ�
		while (pre.next != null) {
			newPre.next = new RandomListNode(pre.next.label);
			pre = pre.next;
			newPre = newPre.next;
			map.put(newPre, pre);
		}
		
		// ��������random�ڵ�
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
