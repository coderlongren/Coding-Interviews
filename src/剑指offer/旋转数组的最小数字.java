package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����5:00:59
* ��˵��:��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
*  ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
* ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
*/
public class ��ת�������С���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5,0,1,2};
		System.out.println(minNumberInRotateArray(array));
	}
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;// ���鳤��Ϊ0 ���Ϸ�
		}
		
		int left = 0;// ����ĵ�һ��Ԫ��
		int right = array.length - 1;
		int mid = left;
		
		while (array[left] >= array[right]) {
			// ��right - left = 1 ��һ���ǽ��
			if (right - left == 1) {
				return array[right];
			}
			mid = (left + right)/2;
			
			if (array[mid] == array[left] && array[left] == array[right]) {
				return minNum(array, left, right);
			}
			// ��Сֵ �ں�벿��
			else if (array[left] >= array[mid]) {
				right = mid;
			}
			else {
				left = mid;
			}
			
		}
		return array[mid];
		
	}
	// ˳�������СԪ��
	public static int minNum(int[] array, int left, int right) {
		int min = array[left];
		while (left <= right) {
			min = Math.min(min, array[left++]);
		}
		return min;
	}
	 
}
