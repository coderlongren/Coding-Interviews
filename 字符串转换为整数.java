package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��26�� ����5:01:22
* ��˵��:  ��Ҫ��ϸ������:
* 1�����ܲ��ԣ�������+-�������������������0
2���������룺���ַ������������������ַ����������a12
3���߽�ֵ���������������С������������
*/
public class �ַ���ת��Ϊ���� {
	 public static int StrToInt(String str) {
		 if (str == null || str.length() == 0) {
			 // ���ַ���
			 return 0;
		 }
		 char[] chars = str.toCharArray();
		 int i = 0;
		 boolean fuhao = true; // Ĭ����+
		 if (chars[0] == '-') {
			 fuhao = false;
			 i = 1;
		 }
		 int sum = 0;
		 for (; i < chars.length; i++) {
			 if (chars[i] == '+') {
				 continue; // ����ĸ +�� ����
			 }
			 if (chars[i] < 48 || chars[i] > 57) {
				 return 0;
			 }
			 sum = sum*10  + chars[i] - 48;
			 
			 // ��Ҫ�ж��Ƿ����
			 if (fuhao && sum > 0X7fffffff || !fuhao && sum < 0X80000000) {
				 return 0; // ���������0X7FFF FFFF,��С������0X8000 0000 ���
			 }
		 }
		 return fuhao ? sum : sum * -1;
	 }
	 public static void main(String[] args) {
		System.out.println(StrToInt("-6411"));
	}
	 
}
