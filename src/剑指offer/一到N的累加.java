package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��23�� ����10:13:22
* ��˵��: ��1+2+3+��+n��Ҫ����ʹ��
* �˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
*/
public class һ��N���ۼ� {
	public static int Sum_Solution(int n) {
        int result = 0;
        int a = 1;
        boolean value = ((n!=0) && a == (result = Sum_Solution(n-1))); // ���� && ��·���ž����� 
        result += n;    
        return result;
    }
	public static void main(String[] args) {
		
		System.out.println(Sum_Solution(4));
	}
}
