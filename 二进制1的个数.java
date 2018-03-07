package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午9:10:45
* 类说明: 
*/
public class 二进制1的个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = Integer.toBinaryString(5);
		string = Integer.toBinaryString(Integer.valueOf("111",2));
		string = Integer.toBinaryString(-16);
//		System.out.println(string);
		System.out.println(NumberOf2(-4));
	}
	// 改进的算法，可以应对负数情况
	public static int  NumberOf2(int n) {
        int count= 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0){
                count++;      
            }
            flag  = flag << 1;
        }
        return count;
	}
	// 负数，会造成死循环
	public static int  NumberOf1(int n) {
        int count= 0;
        int flag = 1;
        while (n!= 0){
            if ((n & 1) != 0){
                count++;      
            }
            n = n>>1;
        }
         return count;
     }  

}
