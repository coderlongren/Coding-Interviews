package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��16�� ����8:35:45
* ��˵��: 
*/
public class ������1���ִ������� {
	 public int NumberOf1Between1AndN_Solution(int n) {
	        //��x=1ʱ
	        return NumberOfXBetween1AndN_Solution1(n,1);       
	    }

	 /**
	 * @param n
	 * @param x [1,9]
	 * @return ����1��n������x���ֵĴ�����
	 */
	    public int NumberOfXBetween1AndN_Solution1(int n,int x) {
	        if(n<0||x<1||x>9)
	            return 0;
	        int high,low,curr,tmp,i = 1;
	        high = n;
	        int total = 0;
	        while(high!=0){
	            high = n/(int)Math.pow(10, i);// ��ȡ��iλ�ĸ�λ
	            tmp = n%(int)Math.pow(10, i);
	            curr = tmp/(int)Math.pow(10, i-1);// ��ȡ��iλ
	            low = tmp%(int)Math.pow(10, i-1);// ��ȡ��iλ�ĵ�λ
	            if(curr==x){
	                total+= high*(int)Math.pow(10, i-1)+low+1;
	            }else if(curr<x){
	                total+=high*(int)Math.pow(10, i-1);
	            }else{
	                total+=(high+1)*(int)Math.pow(10, i-1);
	            }
	            i++;
	        }
	        return total;       
	    }
}
