package 剑指offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月14日 下午9:37:09
* 类说明: 
* 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
* 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
* 超过数组长度的一半，因此输出2。如果不存在则输出0
*/
public class 数组中出现次数超过一半的数字 {
	public static int MoreThanHalfNum_Solution(int [] array) {
		// 使用map数据结构的方法
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], map.getOrDefault(array[i], 1));
			}
			else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() > array.length/2) {
				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}
		return 0;
	}
	public int MoreThanHalfNum_Solution2(int [] array) {
	       if(array==null || array.length <= 0){
	           return 0;
	       }

	       int result = array[0];
	       int count = 1;
	       for (int i = 1; i < array.length; i++) {
	           if (array[i] == result) {
	               count++;
	           } else if (count > 0 ) {
	               count--;
	           } else if(count == 0){
	               result = array[i];
	               count = 1;
	           }
	       }
	       //验证
	       count=0;
	       for(int i=0;i<array.length;i++){
	           if(array[i]==result)
	                count++;
	       }
	       return count > array.length/2 ? result : 0;
	   }
	public static void main(String[] args) {
		int[] array = {1,2,3,2,2,2,5,4,2};
		MoreThanHalfNum_Solution(array);
		
	}
}
