package ��ָoffer;

import java.util.function.LongToDoubleFunction;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����9:50:52
* ��˵��:  �ù鲢��������õ�
*/
public class ��������˳������λ��ż��֮ǰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		reOrderArray(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	// ֱ���Ͽ��Űɣ���Ȼ���Ǻ��ȶ�
	public  static void reOrderArray(int[] array) {
		if (array.length == 0) {
			return ;
		}
		
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			// ֻΪ�ҵ�һ��ż��
			while (low < high && array[low]%2 == 1) {
				low++;
			}
			// ֻΪ�ҵ�һ������
			while (low < high && array[high]%2 == 0) {
				high--;
			}
			// ��Ȼ����ߵ�ż���ҵ��ˣ����ұߵ������ҵ��ˣ��Ǿͽ�����
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
		}
		
	}

}
