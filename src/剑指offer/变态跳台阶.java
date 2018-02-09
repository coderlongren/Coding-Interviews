package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午7:20:52
* 类说明: 
*/
public class 变态跳台阶 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1<<3);
	}
	 public int jumpFloor2(int n) {
		 if (n <= 0) {
			 return 0;
		 }
		 return 1<<(n - 1); // 相当于2的 n-1 次幂
	 }
}
