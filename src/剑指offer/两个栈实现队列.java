package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午4:50:08
* 类说明: 
*/
public class 两个栈实现队列 {
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	// 入队，就是每一次就push()进 stack1中
	public void push(int node) {
		stack1.push(node);
	}
	
	// 出队操作： 把stack2全部清空，然后把stack1里面的所有元素都出栈，再进栈 stack2，返回的就是stack2.pop()
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
