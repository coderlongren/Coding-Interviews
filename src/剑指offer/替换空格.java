package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��8�� ����9:43:50
* ��˵��:
* /*
����1���滻�ַ���������ԭ�����ַ��������滻�������¿���һ���ַ������滻��
����2���ڵ�ǰ�ַ����滻����ô�滻�Ÿ���Ч�ʣ�������java�����е�replace��������
      ��ǰ�����滻��������ַ�Ҫ���������ƶ���Ҫ����ƶ�������Ч�ʵ���
      �Ӻ���ǰ���ȼ�����Ҫ���ٿռ䣬Ȼ��Ӻ���ǰ�ƶ�����ÿ���ַ�ֻΪ�ƶ�һ�Σ�����Ч�ʸ���һ�㡣 
*/
public class �滻�ո� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer("a b s ");
		System.out.println(replaceSpace(stringBuffer));
	}
	public static String replaceSpace(StringBuffer str) {
		int spaceNum = 0; // SpaceNumΪ����ո���
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		int indexold = str.length() - 1;
		int newlength = str.length() + spaceNum*2;// �滻֮��ĳ���
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
