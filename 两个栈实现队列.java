package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����4:50:08
* ��˵��: 
*/
public class ����ջʵ�ֶ��� {
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	// ��ӣ�����ÿһ�ξ�push()�� stack1��
	public void push(int node) {
		stack1.push(node);
	}
	
	// ���Ӳ����� ��stack2ȫ����գ�Ȼ���stack1���������Ԫ�ض���ջ���ٽ�ջ stack2�����صľ���stack2.pop()
	public int pop() {
		while (!stack2.isEmpty()) {
			return stack2.pop();
		}
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	
}
