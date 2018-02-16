package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月16日 下午6:49:51
* 类说明: 
*/
public class 连续子数组的最大和 {
	// 贪心算法
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
	// DP解法
	// 整体来说，DP解法和贪心算法是相同的，只不过需要先写出状态转移方程
	// 设 f(j) 是从S[0] 到S[j]的最大和
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
	/// 测试
	public static void main(String[] args) {
		int[] array = {-4,2,-5,6,9,-88,44,-5,99};
		System.out.println(FindGreatestSumOfSubArray(array));
		System.out.println(FindGreatestSumOfSubArray2(array));
	}
}
