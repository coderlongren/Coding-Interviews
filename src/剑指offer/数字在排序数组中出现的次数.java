package 剑指offer;

import java.awt.Image;
import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午8:34:47
* 类说明: 
*/
public class 数字在排序数组中出现的次数 {
	public static int GetNumberOfK(int [] array, int k) {
		int num = 0;
//		Arrays.sort(array);
		if (array != null && array.length > 0) { 
			int firstKIndex = getFirst(array, k, 0, array.length - 1);
			int lastKIndex = getLast(array, k ,0, array.length - 1);
			
			if (firstKIndex > -1 && lastKIndex > -1) {
				return lastKIndex - firstKIndex + 1;
			}
		}
		return num;
	}
	// 二叉搜索寻找第一个 k 元素
	public static int getFirst (int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = start + (end - start)/2;
		int middleData =  array[middle];
		if (middleData == k) {
			// 需要判断是不是第一个 k, 
			// 前一个 不等于k, 就是第一个k
			if (middleData > 0 && array[middle - 1] != k || middle == 0) {
				return middle;
			}
			else {
				end = middle - 1;
			}
		}
		else if (middleData > k) {
			end = middle - 1;
		}
		else {
			start = middle + 1;
		}
		return getFirst(array, k, start, end);
		
	}
	// 二叉搜索最后一个 k 元素
	public static int getLast (int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = start + (end - start)/2;
		int middleData =  array[middle];
		if (middleData == k) {
			// 需要判断是不是最后一个k元素
			if (middle < array.length - 1 && array[middle + 1] != k || middle == array.length - 1) {
				return middle;
			}
			else {
				start = middle + 1;
			}
		}
		else if (middleData > k) {
			end = middle - 1;
		}
		else {
			start = middle + 1;
		}
		return getLast(array, k, start, end);
	}
	public static void main(String[] args) {
		int[] array = {0,1,2,2,6,6,8,8,8};
		System.out.println(GetNumberOfK(array, 6)); //次数正确
		
	}
}
