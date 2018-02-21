package 剑指offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午3:34:49
* 类说明: 
*/
public class 数组中的逆序对 {
	public static int InversePairs(int [] array) {

		Integer[] newArray = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		Arrays.sort(newArray);
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.println(newArray[i]);
//		}
		int count = 0;
		for (int i = newArray.length - 1; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				System.out.println("(" + newArray[i] + "," + newArray[j] + ")");
				count++;
			}
		}
		System.out.println(count);
		return 0; //5 4 3 2 1
	}
	public static void main(String[] args) {
		int[] array = {7,5,6,4};
		InversePairs(array);
	}
}
