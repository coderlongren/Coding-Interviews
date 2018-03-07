package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月23日 下午9:58:58
* 类说明: 
*/
public class 约瑟夫环问题 {
	// 数组求解
	public static int LastRemaining_Solution1(int n, int m) {
		if(n<1||m<1) return -1;
        int[] array = new int[n];
        int i = -1,step = 0, count = n;
        while(count>0){   //跳出循环时将最后一个元素也设置为了-1
            i++;          //指向上一个被删除对象的下一个元素。
            if(i>=n) i=0;  //模拟环。
            if(array[i] == -1) continue; //跳过被删除的对象。
            step++;                     //记录已走过的。
            if(step==m) {               //找到待删除的对象。
                array[i]=-1;
                step = 0;
                count--;
            }        
        }
        return i;//返回跳出循环时的i,即最后一个被设置为-1的元素
	}
	// 链表求解
	public static int LastRemaining_Solution2(int n, int m) {
		if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int k = 0;
        while (data.size() > 1) {
        	k = (k + m)%data.size() - 1;
        	// 到达末尾
        	if (k < 0) {
        		data.remove(data.size() - 1);
        		k = 0;// 重置k = 0
        	}
        	else {
        		data.remove(k);
        	}
        }
        return data.get(0);
	}
	// 约瑟夫经典解法，O(N)，空间复杂度O(1)
	public static int LastRemaining_Solution3(int n, int m) {
		if (n == 0) {
			return -1;
		}
		int s = 0;
		for (int i = 2; i <= n; i++) {
			s = (s + m)%i;
		}
		return s;
	}
}
