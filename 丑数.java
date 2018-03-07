package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��17�� ����1:42:12
* ��˵��:  ����������ʵ �ǿ���ͨ����ɳʽ����֪���������
*/
public class ���� {
	// ��� ���� ����
	public static  boolean IsUgly(int number) {
		while (number % 2 == 0) {
			number /= 2;
		}
		while (number % 3 == 0) {
			number /= 3;
		}
		while (number  % 5 == 0) {
			number /= 5;
		}
		
		return (number == 1) ? true : false;
	}
	// ��ó����ĺ���
	public int GetUglyNumber(int index)
	{
	    if(index <= 0)
	        return 0;

	    int number = 0;
	    int uglyFound = 0;
	    while(uglyFound < index)
	    {
	        ++number;

	        if(IsUgly(number))
	        {
	            ++uglyFound;
	        }
	    }

	    return number;
	}
	// �Ż�˼· �� ��O��n���ĸ����ռ����õ�O(n)��ʱ�临�Ӷȡ�
	//�����˼���ǣ�ÿһ��������Ȼ����֮ǰ��ĳ��������2��3��5�ĳ˻��õ��ģ�
	//������һ����������֮ǰ�ĳ����ֱ����2��3��5���ҳ�����������С�Ĳ��Ҵ��ڵ�ǰ��������ֵ����Ϊ��һ��Ҫ��ĳ�����
	public static int GetUglyNumber_Solution(int n)
    {
        if(n==0)return 0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(1);
        int i2=0,i3=0,i5=0;
        while(res.size()<n)
        {
            int m2=res.get(i2)*2;
            int m3=res.get(i3)*3;
            int m5=res.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            res.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return res.get(res.size()-1);
    }
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(GetUglyNumber_Solution(i));
		}
	}
	
}
