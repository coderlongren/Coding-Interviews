package 剑指offer;

import java.util.Arrays;
import java.util.Comparator;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月16日 下午9:03:10
* 类说明: 
*/
public class 把数组排列成最小的数 {
	 public static String PrintMinNumber(int [] numbers) {
		 if(numbers == null || numbers.length == 0) {
			 return "";
		 }
	     int len = numbers.length;
	     String[] strs = new String[len];
	     for (int i = 0; i < strs.length; i++) {
	    	 strs[i] = String.valueOf(numbers[i]);
	     }
		 Arrays.sort(strs, new Comparator<String>() {

			@Override
			//compareto方法，返回参与比较的前后两个字符串的asc码的差值，看下面一组代码 
			public int compare(String s1, String s2) {
				String c1 = s1 + s2;
				String c2 = s2 + s1;
				return c1.compareTo(c2);
			}
		});
		 
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strs.length; i++) {
			stringBuffer.append(strs[i]);
		}
		return stringBuffer.toString();  
	 }
	 
	 
	 public static void main(String[] args) {
		int[] a = {5,2,56,4,9};
		System.out.println(PrintMinNumber(a));
	}
}
