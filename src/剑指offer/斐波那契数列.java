package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����7:06:46
* ��˵��: 
*/
public class 쳲��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	// ѭ���ķ�����ʱ�临�Ӷ�:O(n)
	public static int fib(int n) {
		int prepreNum = 0;
		int preNum = 1;
		int result = 0;
		
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			result = preNum + prepreNum;
			prepreNum = preNum;
			preNum = result;
		}
		return result;
		
	}
	
	
}
