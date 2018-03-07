package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月22日 下午12:32:26
* 类说明:  双指针法
*/
public class 和为S的两个数字 {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
            list.add(array[i]);
            list.add(array[j]);
                return list;
           }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }

        }
        return list;
    }
}
