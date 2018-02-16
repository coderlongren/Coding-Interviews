package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月16日 下午4:47:20
* 类说明: 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
*/
public class 最小的K个数 {
	// 使用快速排序的思想，
	  public static ArrayList GetLeastNumbers_Solution(int [] input, int k) {
		  List<Integer> res = new ArrayList<>();
		  if (input == null || input.length == 0 || k > input.length) {
			  return (ArrayList<Integer>)res;
		  }
		  int low = 0; 
		  int high = input.length - 1;
		  int index = Partition(input, k, low, high);
		  // 循环 分段 
		  while (index != k - 1) {
			  if (index > k - 1) {
				  high = index - 1;
				  index = Partition(input, k, low, high);
			  }
			  else {
				  low = index + 1;
				  index = Partition(input, k, low, high);
			  }
		  }
		  for (int i = 0; i < k; i++)
	            res.add(input[i]);
	        return (ArrayList<Integer>)res;
		  
	  }
	  // 快速排序分段过程
	  public static int Partition(int[] array, int k, int low, int high) {
		  Swap(array, low, k - 1);
		  int key = array[low];
		  
		  while (low < high) {
			  // 找到一个 小于key的元素
			  while (low < high && array[high] >= key) {
				  high--;
			  }
			  Swap(array, low, high);
			  while (low < high && array[low] <= key) {
				  low++;
			  }
			  Swap(array, low, high);
		  }
		  array[low] = key;
		  return low;
		  
	  }
	  
	  // 交换数组中的两个元素
	  public static void Swap(int[] array, int low, int high) {
		  int temp = array[low]; 
		  array[low] = array[high];
		  array[high] = temp;
	  }
	  public static void main(String[] args) {
		int[] input = {4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(input, 8));
	}
}
