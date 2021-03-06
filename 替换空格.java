package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午9:43:50
* 类说明:
* /*
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
      从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。 
*/
public class 替换空格 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer("a b s ");
		System.out.println(replaceSpace(stringBuffer));
	}
	public static String replaceSpace(StringBuffer str) {
		int spaceNum = 0; // SpaceNum为计算空格数
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexold = str.length() - 1;
		int newlength = str.length() + spaceNum*2;// 替换之后的长度
		int indexnew = newlength - 1;
		str.setLength(newlength);
		
		for (;indexold >= 0; indexold--) {
			if (str.charAt(indexold) == ' ') {
				str.setCharAt(indexnew--, '0');
				str.setCharAt(indexnew--, '2');
				str.setCharAt(indexnew--, '%');
			}
			else {
				str.setCharAt(indexnew--, str.charAt(indexold));
			}
		}
		
		return str.toString();
	}
	

}
