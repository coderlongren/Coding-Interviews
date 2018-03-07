package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月17日 下午1:42:12
* 类说明:  丑数问题其实 是可以通过，沙式法则知道如何求解的
*/
public class 丑数 {
	// 求解 丑数 函数
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
	// 获得丑数的函数
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
	// 优化思路 ： 用O（n）的辅助空间来得到O(n)的时间复杂度。
	//其核心思想是：每一个丑数必然是由之前的某个丑数与2，3或5的乘积得到的，
	//这样下一个丑数就用之前的丑数分别乘以2，3，5，找出这三这种最小的并且大于当前最大丑数的值，即为下一个要求的丑数。
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
