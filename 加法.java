package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��26�� ����12:54:13
* ��˵��: 
*/
public class �ӷ� {
	public static int Add(int num1,int num2) {
		// ���ö����Ƶ� ^ & ���
		int carry = (num1&num2)<<1;
		while (carry != 0) {
			int temp = num1^num2; // �����λ����λ��� 
			carry = (num1&num2)<<1; // �õ���λ��
			num1 = temp; // �ظ�ִ��
			num2 = carry; // �ظ�ִ��
		}
		return num1;
	}
	public static void main(String[] args) {
		System.out.println(Add(2, 22));
	}
}
