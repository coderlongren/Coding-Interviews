package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��22�� ����9:27:27
* ��˵��: �����ȷ�ת�����ַ�����������ʷ�ת
*/
public class ��ת���� {
	public static String ReverseSentence(String str) {
		if (str == null || str.trim().equals(" ")) {
			return str;
		}
		String[] words = str.split(" "); // �ո��з�����
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			buffer.append(reverse(words[i]) + " ");
		}
		buffer.deleteCharAt(buffer.length() - 1); // ɾ�����Ŀո�
		return buffer.reverse().toString();
	}
	public static String reverse(String str){
		StringBuffer stringBuffer = new StringBuffer(str);
		return stringBuffer.reverse().toString();
	}
	
	
	// ��չ��Ŀ��  �ַ�������nλ��abcde������2λ��cdeab
	// ǰnλ��ת����λ��ת������ܵķ�ת
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
