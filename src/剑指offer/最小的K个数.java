package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��16�� ����4:47:20
* ��˵��: ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
*/
public class ��С��K���� {
	// ʹ�ÿ��������˼�룬
	  public static ArrayList GetLeastNumbers_Solution(int [] input, int k) {
		  List<Integer> res = new ArrayList<>();
		  if (input == null || input.length == 0 || k > input.length) {
			  return (ArrayList<Integer>)res;
		  }
		  int low = 0; 
		  int high = input.length - 1;
		  int index = Partition(input, k, low, high);
		  // ѭ�� �ֶ� 
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
	  // ��������ֶι���
	  public static int Partition(int[] array, int k, int low, int high) {
		  Swap(array, low, k - 1);
		  int key = array[low];
		  
		  while (low < high) {
			  // �ҵ�һ�� С��key��Ԫ��
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
	  
	  // ���������е�����Ԫ��
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
