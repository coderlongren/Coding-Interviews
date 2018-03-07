package 剑指offer;

import java.util.function.LongToDoubleFunction;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午9:50:52
* 类说明:  用归并排序是最好的
*/
public class 调整数组顺序奇数位于偶数之前 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		reOrderArray(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	// 直接上快排吧，虽然不是很稳定
	public  static void reOrderArray(int[] array) {
		if (array.length == 0) {
			return ;
		}
		
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			// 只为找到一个偶数
			while (low < high && array[low]%2 == 1) {
				low++;
			}
			// 只为找到一个奇数
			while (low < high && array[high]%2 == 0) {
				high--;
			}
			// 既然最左边的偶数找到了，最右边的奇数找到了，那就交换吧
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
		}
		
	}

}
