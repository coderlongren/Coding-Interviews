package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月22日 下午12:34:04
* 类说明: 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*  S = 9 --> [2,3,4]
*   双指针法求得解
*/
public class 和为S的连续正数序列 {
	
	// 第一次暴力穷举的垃圾算法
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence2(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (sum < 3) {
			return res;
		}
		int s = sum/2;
		for (int i = 1; i <= s; i++) {
			int sumTemp = 0;
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = i; j <= s; j++) {
				sumTemp += j;
				temp.add(j);
				if (sumTemp >= sum) {
					break;
				}
			}
			if (sumTemp == sum) {
				res.add(new ArrayList<>(temp));
			}
		}
		return res;
		
		
	}
	
	// 根据剑指offer，优化的算法
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum < 3)
            return list;
        ArrayList<Integer> l = new ArrayList<Integer>();
        int small = 2;
        int middle = (1 + sum) / 2;//因为至少连续2个且顺序增加，所以取中间值
        l.add(1);
        l.add(2);
        int s = 3;
        if (s == sum) {
            list.add(new ArrayList<Integer>(l));
        }

        while (small <= middle) {
            small++;
            s += small;
            l.add(small);
            if (s == sum) {
                list.add(new ArrayList<Integer>(l));
            }
            //两个指针，若大，减去左边数字，若小，加右边数字
            while (s > sum && small <= middle) {
                s -= l.remove(0);
                if (s == sum) {
                    list.add(new ArrayList<Integer>(l));
                }
            }

        }
        return list;
    }
	public static void main(String[] args) {
//		System.out.println(FindContinuousSequence2(6));
		System.out.println(FindContinuousSequence(25));
	}
}
