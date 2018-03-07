package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午7:06:46
* 类说明: 
*/
public class 斐波那契数列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	// 循环的方法，时间复杂度:O(n)
	public static int fib(int n) {
		int prepreNum = 0;
		int preNum = 1;
		int result = 0;
		
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			result = preNum + prepreNum;
			prepreNum = preNum;
			preNum = result;
		}
		return result;
		
	}
	
	
}
