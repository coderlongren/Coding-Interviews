package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��13�� ����7:15:33
* ��˵��: 
*/
public class ջ��ѹ�뵯������ {
	 public boolean IsPopOrder(int [] pushA,int [] popA) {
		 if (pushA.length == 0 || popA.length == 0) {
			 return false;
		 }
		 // ����ջ������......
		 Stack<Integer> stack = new Stack<>();
		 int popIndex = 0;
		 for (int i = 0; i < pushA.length; i++) {
			 stack.push(pushA[i]);
			 while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				 stack.pop();
				 popIndex++;
			 }
		 }
		 // ���»�÷���ֵ
		 return stack.isEmpty();
		 
	 }
}
