package ��ָoffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����3:34:49
* ��˵��: 
*/
public class �����е������ {
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
