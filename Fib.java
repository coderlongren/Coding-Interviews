package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����7:07:23
* ��˵��: �ݹ飬 ��࣬����Ч�ʲ�����
*/
public class Fib {
	public int fib(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
