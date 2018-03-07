package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月26日 下午5:01:22
* 类说明:  主要是细节问题:
* 1、功能测试：输入有+-号情况，区分正负数和0
2、特殊输入：空字符串情况，输入非数字字符串情况，如a12
3、边界值：最大正整数和最小负整数溢出情况
*/
public class 字符串转换为整数 {
	 public static int StrToInt(String str) {
		 if (str == null || str.length() == 0) {
			 // 空字符串
			 return 0;
		 }
		 char[] chars = str.toCharArray();
		 int i = 0;
		 boolean fuhao = true; // 默认是+
		 if (chars[0] == '-') {
			 fuhao = false;
			 i = 1;
		 }
		 int sum = 0;
		 for (; i < chars.length; i++) {
			 if (chars[i] == '+') {
				 continue; // 首字母 +号 忽略
			 }
			 if (chars[i] < 48 || chars[i] > 57) {
				 return 0;
			 }
			 sum = sum*10  + chars[i] - 48;
			 
			 // 还要判断是否溢出
			 if (fuhao && sum > 0X7fffffff || !fuhao && sum < 0X80000000) {
				 return 0; // 正整数最大0X7FFF FFFF,最小负整数0X8000 0000 溢出
			 }
		 }
		 return fuhao ? sum : sum * -1;
	 }
	 public static void main(String[] args) {
		System.out.println(StrToInt("-6411"));
	}
	 
}
