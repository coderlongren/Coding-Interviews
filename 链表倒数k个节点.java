package ��ָoffer;

import java.security.acl.LastOwnerException;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����10:31:24
* ��˵��: 
*/
public class ������k���ڵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ˫ָ�뷨������ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)����
	// �����k���ڵ㡣Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ��
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		ListNode pre = head;
		ListNode last = head;
		
		// �ƶ� k-1 ���� ��Ϊ��һ�ξ��ڵ�һ���ڵ���, �ƶ�֮�󵽴��K���ڵ�
		for (int i = 1; i < k; i++) {
			if (pre.next != null) {
				pre = pre.next;
			}
			// k ����������
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
