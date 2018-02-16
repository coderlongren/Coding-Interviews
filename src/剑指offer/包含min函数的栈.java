package 剑指offer;

import java.nio.channels.NetworkChannel;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月13日 下午6:44:26
* 类说明: 用一个栈data保存数据，
* 用另外一个辅助栈min保存依次入栈最小的数
*/
public class 包含min函数的栈 {
	Stack<Integer> data = new Stack<>();
	Stack<Integer> min = new Stack<>();
	
	public void push(int x) {
		data.push(x);
		if (min.isEmpty()) {
			min.push(x);
		}
		else {
			if (min.peek() <= x) {
				min.push(min.peek());
			}
			else {
				min.push(x);
			}
		}
	}
	
	public void pop(){
		if (!data.isEmpty()) {
			data.pop();
			min.pop();
		}
	}
	public int peek() {
		return data.peek();
	}
	public int min() {
		return min.peek();
	}
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	} 

}
