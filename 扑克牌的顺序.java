package ��ָoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��22�� ����10:33:53
* ��˵��: ѡȡ5���ƣ�����ȥ0��Ȼ������������ֵ����Сֵ�Ƿ�С�ڵ���4������4��Ϊfalse��
Ȼ���������Ӧ�ô���0С��5�����Ϊfalse
*/
public class �˿��Ƶ�˳�� {
	 public boolean isContinuous(int [] numbers) {
		 if (numbers == null || numbers.length == 0 || numbers.length > 5) {
			 return false;
		 }
		 List<Integer> list = new ArrayList<>();
		 int count = 0;
		 for (int i = 0; i < numbers.length; i++) {
			 if (0 == numbers[i]) {// 0���Դ����κ��������Ե����ó�
				 count++;
			 }
			 else {
				 list.add(numbers[i]);
			 }
		 }
		 // û��0������
		 Collections.sort(list);
		 // ���ֵ ��Сֵ֮���������4 ������Ҫ��
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
