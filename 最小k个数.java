package ��ָoffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��16�� ����6:44:31
* ��˵��:  ��һ�����У��������� ��������Ҳ������TreeSet��Ȼ�����ص�洢��ֵ��
*/
public class ��Сk���� {
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
