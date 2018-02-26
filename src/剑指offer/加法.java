package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月26日 下午12:54:13
* 类说明: 
*/
public class 加法 {
	public static int Add(int num1,int num2) {
		// 利用二进制的 ^ & 求解
		int carry = (num1&num2)<<1;
		while (carry != 0) {
			int temp = num1^num2; // 不算进位，各位相加 
			carry = (num1&num2)<<1; // 得到进位数
			num1 = temp; // 重复执行
			num2 = carry; // 重复执行
		}
		return num1;
	}
	public static void main(String[] args) {
		System.out.println(Add(2, 22));
	}
}
