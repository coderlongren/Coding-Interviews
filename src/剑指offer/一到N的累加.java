package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月23日 下午10:13:22
* 类说明: 求1+2+3+…+n，要求不能使用
* 乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
*/
public class 一到N的累加 {
	public static int Sum_Solution(int n) {
        int result = 0;
        int a = 1;
        boolean value = ((n!=0) && a == (result = Sum_Solution(n-1))); // 利用 && 短路符号就行了 
        result += n;    
        return result;
    }
	public static void main(String[] args) {
		
		System.out.println(Sum_Solution(4));
	}
}
