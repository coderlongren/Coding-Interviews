package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月26日 下午6:46:13
* 类说明: 
*/
public class 数组中重复的数 {
	boolean duplicate(int numbers[], int length, int[] duplication) {
        if(length < 2||numbers==null){
            return false;
        }

        Set<Integer> ss = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (ss.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                ss.add(numbers[i]);
            }
        }
        return false;
    }
}
