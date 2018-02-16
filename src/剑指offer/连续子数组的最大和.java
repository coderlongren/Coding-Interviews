package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��16�� ����6:49:51
* ��˵��: 
*/
public class ��������������� {
	// ̰���㷨
	public static int FindGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		else {
			int total = array[0];
			int maxSum = array[0];
			
			for (int i = 1; i < array.length; i++) {
				if (total > 0) {
					total += array[i];
				}
				else {
					total = array[i];
				}
				if (total > maxSum) {
					maxSum = total;
				}
			}
			return maxSum;
		}
	}
	// DP�ⷨ
	// ������˵��DP�ⷨ��̰���㷨����ͬ�ģ�ֻ������Ҫ��д��״̬ת�Ʒ���
	// �� f(j) �Ǵ�S[0] ��S[j]������
	// f(j) = max(s[j], f[j - 1] + s[j])
	public static int FindGreatestSumOfSubArray2(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int result = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = Math.max(array[i], sum + array[i]);
			result = Math.max(result, sum);
		}
		return sum;
	}
	/// ����
	public static void main(String[] args) {
		int[] array = {-4,2,-5,6,9,-88,44,-5,99};
		System.out.println(FindGreatestSumOfSubArray(array));
		System.out.println(FindGreatestSumOfSubArray2(array));
	}
}
