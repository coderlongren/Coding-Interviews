package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����7:20:52
* ��˵��: 
*/
public class ��̬��̨�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1<<3);
	}
	 public int jumpFloor2(int n) {
		 if (n <= 0) {
			 return 0;
		 }
		 return 1<<(n - 1); // �൱��2�� n-1 ����
	 }
}
