package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月22日 下午10:33:53
* 类说明: 选取5张牌，首先去0，然后进行排序，最大值减最小值是否小于等于4，大于4，为false，
然后相邻相减应该大于0小于5，否的为false
*/
public class 扑克牌的顺序 {
	 public boolean isContinuous(int [] numbers) {
		 if (numbers == null || numbers.length == 0 || numbers.length > 5) {
			 return false;
		 }
		 List<Integer> list = new ArrayList<>();
		 int count = 0;
		 for (int i = 0; i < numbers.length; i++) {
			 if (0 == numbers[i]) {// 0可以代表任何数，所以单独拿出
				 count++;
			 }
			 else {
				 list.add(numbers[i]);
			 }
		 }
		 // 没有0的排序
		 Collections.sort(list);
		 // 最大值 最小值之差如果大于4 不符合要求
		 if (Math.abs(list.get(0) - list.get(list.size() - 1)) > 4) {
			return false;
		 }
		 for (int i = 0; i < list.size() - 1; i++) {
			 // 
			int temp = list.get(i + 1) - list.get(i);
            if(0 < temp && temp < 5){
                continue;
            }else{
                return false;
            }
		 }
		return true;
		 
	 }
}
