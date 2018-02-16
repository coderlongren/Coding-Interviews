package 剑指offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月16日 下午6:44:31
* 类说明:  上一道题中，我是用了 快速排序，也可以用TreeSet自然排序特点存储数值，
*/
public class 最小k个数 {
	public ArrayList GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> leastNum = new ArrayList<Integer>();
        if (input == null || input.length < 1 || k < 1 || k > input.length)
            return leastNum;
        TreeSet<Integer> kSet = new TreeSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            if (kSet.size() < k) {
                kSet.add(input[i]);
            } else {
                if (input[i] < kSet.last()) {
                    kSet.remove(kSet.last());
                    kSet.add(input[i]);
             
                }
            }
        }
        Iterator<Integer> it = kSet.iterator();
        while (it.hasNext()) {
            leastNum.add(it.next());
        }

        return leastNum;
	}
}
