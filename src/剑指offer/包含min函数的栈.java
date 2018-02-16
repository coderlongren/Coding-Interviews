package ��ָoffer;

import java.nio.channels.NetworkChannel;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��13�� ����6:44:26
* ��˵��: ��һ��ջdata�������ݣ�
* ������һ������ջmin����������ջ��С����
*/
public class ����min������ջ {
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
