package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����9:10:45
* ��˵��: 
*/
public class ������1�ĸ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = Integer.toBinaryString(5);
		string = Integer.toBinaryString(Integer.valueOf("111",2));
		string = Integer.toBinaryString(-16);
//		System.out.println(string);
		System.out.println(NumberOf2(-4));
	}
	// �Ľ����㷨������Ӧ�Ը������
	public static int  NumberOf2(int n) {
        int count= 0;
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0){
                count++;      
            }
            flag  = flag << 1;
        }
        return count;
	}
	// �������������ѭ��
	public static int  NumberOf1(int n) {
        int count= 0;
        int flag = 1;
        while (n!= 0){
            if ((n & 1) != 0){
                count++;      
            }
            n = n>>1;
        }
         return count;
     }  

}
