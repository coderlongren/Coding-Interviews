package 剑指offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月7日 下午7:48:57
* 类说明: 
*/
public class 滑动窗口的最大值 {
	public ArrayList<Integer> maxInWindows(int [] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		if (num == null) {
			return list;
		}
		
		if (num.length < size || size < 1) {
			return list;
		}
		
		// 用来保存可能是滑动窗口最大值的数字的下标
		LinkedList<Integer> indexDeque = new LinkedList<>();
		for (int i = 0; i < size - 1; i++) {
			// 如果已有数字小于代存入的数据
		}
		return list;
	}
	public static ArrayList<Integer> maxInWindows2(int [] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i : num) {
			data.add(i);
		}
		if (num == null) {
			return list;
		}
		
		if (num.length < size || size < 1) {
			return list;
		}
		Deque<Integer> idx = new LinkedList<>();
		// 窗口还没有填满的时候，找最大的索引
		for (int i = 0; i < size && i < num.length; i++) {
			while (!idx.isEmpty() && data.get(i) > idx.getLast()) {
				idx.removeLast(); // 移除队尾保存的索引
			}
			// 添加索引
			idx.addLast(i); // 在队尾添加索引
		}
		
		// 当窗口被填满了时候
		for (int i = size; i < data.size(); i++) {
			// 第一个窗口用来保存最大值
			list.add(idx.getFirst()); // 队首元素 永远是最大的
			
			// 如果索引对应的 值 比之前的索引值对应的值大或者相等，就删除之前存储的值
			while (!idx.isEmpty() && data.get(i) > data.get(idx.getLast())) {
				idx.removeLast();
			}
			// 删除已经滑出 窗口的数据对应的下标
			while (!idx.isEmpty() && idx.getFirst() <= (i - size)) {
				idx.removeFirst();
			}
			
			idx.addLast(i);
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		int[] nums = {2,3,4,2,6,2,5,1};
		System.out.println(maxInWindows2(nums, 3));
	}
}
