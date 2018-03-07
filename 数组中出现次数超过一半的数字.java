package ��ָoffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��14�� ����9:37:09
* ��˵��: 
* ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
* ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
* �������鳤�ȵ�һ�룬������2����������������0
*/
public class �����г��ִ�������һ������� {
	public static int MoreThanHalfNum_Solution(int [] array) {
		// ʹ��map���ݽṹ�ķ���
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], map.getOrDefault(array[i], 1));
			}
			else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() > array.length/2) {
				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}
		return 0;
	}
	public int MoreThanHalfNum_Solution2(int [] array) {
	       if(array==null || array.length <= 0){
	           return 0;
	       }

	       int result = array[0];
	       int count = 1;
	       for (int i = 1; i < array.length; i++) {
	           if (array[i] == result) {
	               count++;
	           } else if (count > 0 ) {
	               count--;
	           } else if(count == 0){
	               result = array[i];
	               count = 1;
	           }
	       }
	       //��֤
	       count=0;
	       for(int i=0;i<array.length;i++){
	           if(array[i]==result)
	                count++;
	       }
	       return count > array.length/2 ? result : 0;
	   }
	public static void main(String[] args) {
		int[] array = {1,2,3,2,2,2,5,4,2};
		MoreThanHalfNum_Solution(array);
		
	}
}
