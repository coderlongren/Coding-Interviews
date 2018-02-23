package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月22日 下午9:27:27
* 类说明: 就是先翻转所有字符，再逐个单词翻转
*/
public class 反转单词 {
	public static String ReverseSentence(String str) {
		if (str == null || str.trim().equals(" ")) {
			return str;
		}
		String[] words = str.split(" "); // 空格切分数组
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			buffer.append(reverse(words[i]) + " ");
		}
		buffer.deleteCharAt(buffer.length() - 1); // 删除最后的空格
		return buffer.reverse().toString();
	}
	public static String reverse(String str){
		StringBuffer stringBuffer = new StringBuffer(str);
		return stringBuffer.reverse().toString();
	}
	
	
	// 拓展题目：  字符串左移n位，abcde，左移2位，cdeab
	// 前n位反转，后几位反转，最后总的反转
	public String LeftRotateString(String str,int n) {
		char[] chars  = str.toCharArray();
		if (chars.length < n) {
			return "";
		}
		reverse(chars, 0, n - 1);
		reverse(chars, n, chars.length - 1);
		reverse(chars, 0, chars.length - 1);
		StringBuffer stringBuffer = new StringBuffer();
		for (char c : chars) {
			stringBuffer.append(c);
		}
		return stringBuffer.toString();
		
	}
	public void reverse(char[] chars, int low, int high) {
		char temp;
		while (low < high) {
			temp = chars[low];
			chars[low] = chars[high];
			chars[high] = temp;
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(" ds ".trim().length());
		System.out.println(ReverseSentence("student. a am I"));
	}
}
