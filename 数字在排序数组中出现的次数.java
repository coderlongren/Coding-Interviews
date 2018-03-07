package ��ָoffer;

import java.awt.Image;
import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����8:34:47
* ��˵��: 
*/
public class ���������������г��ֵĴ��� {
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
	// ��������Ѱ�ҵ�һ�� k Ԫ��
	public static int getFirst (int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = start + (end - start)/2;
		int middleData =  array[middle];
		if (middleData == k) {
			// ��Ҫ�ж��ǲ��ǵ�һ�� k, 
			// ǰһ�� ������k, ���ǵ�һ��k
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
	// �����������һ�� k Ԫ��
	public static int getLast (int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = start + (end - start)/2;
		int middleData =  array[middle];
		if (middleData == k) {
			// ��Ҫ�ж��ǲ������һ��kԪ��
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
		System.out.println(GetNumberOfK(array, 6)); //������ȷ
		
	}
}
