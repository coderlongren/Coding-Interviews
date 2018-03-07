package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月13日 下午7:15:33
* 类说明: 
*/
public class 栈的压入弹出序列 {
	 public boolean IsPopOrder(int [] pushA,int [] popA) {
		 if (pushA.length == 0 || popA.length == 0) {
			 return false;
		 }
		 // 辅助栈，作用......
		 Stack<Integer> stack = new Stack<>();
		 int popIndex = 0;
		 for (int i = 0; i < pushA.length; i++) {
			 stack.push(pushA[i]);
			 while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				 stack.pop();
				 popIndex++;
			 }
		 }
		 // 重新获得返回值
		 return stack.isEmpty();
		 
	 }
}
