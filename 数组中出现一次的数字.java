package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����10:37:48
* ��˵��: 
*/
public class �����г���һ�ε����� {
	// ����һ
	public static void FindNumsAppearOnce(int[] arr)  
    {  
        int len = arr.length;
        if(len<2) {
        	return; 
        } 

        int i;  
        int AllXOR = 0;  
        //ȫ�����  
        for(i=0;i<len;i++) {
            AllXOR ^= arr[i];
        }

      //�ҳ��ڼ�λΪ1����010
        int res = FindFirstBit1(AllXOR);  

        int num1=0, num2 = 0;  
        for(i=0;i<len;i++)  
        {  //�ֳ�������
            if(IsBit1(arr[i],res)) {
                num1 ^= arr[i];  
            }
            else { 
                num2 ^= arr[i];  
            }
        }  
        System.out.println(num1+"and"+num2);
    }

    /* 
    ����num�����λ��1��������λ��Ϊ0 
    */  
    public static int FindFirstBit1(int num)  
    {  
        //�������õ���������num���ұߵ�1��������������λ��ȫ����Ϊ��0  
        return num & (-num);  
    }  

    /* 
    �ж�data���ض���λ�Ƿ�Ϊ1�� 
    �����Ҫ�жϵ��ض���λ��resȷ���� 
    res��ֻ��һλΪ1������λ��Ϊ0����FindFirstBit1�������أ� 
    ��data��Ҫ�жϵ�λ����res����Ψһ��1���ڵ�λ 
    */  
    public static boolean IsBit1(int data,int res)  
    {  
        return ((data & res)==0) ? false:true;  
    }  

    public static void main(String[] args) {
//        int[] a = { 1,1,2,2,3,44,55,55,66,66,34,34,5,5,7,7 };
//        FindNumsAppearOnce(a);
    	System.out.println(Integer.toBinaryString(10));
    	System.out.println(Integer.toBinaryString(-10));

    }

}
