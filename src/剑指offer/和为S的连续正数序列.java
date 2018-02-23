package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��22�� ����12:34:04
* ��˵��: ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
*  S = 9 --> [2,3,4]
*   ˫ָ�뷨��ý�
*/
public class ��ΪS�������������� {
	
	// ��һ�α�����ٵ������㷨
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
	
	// ���ݽ�ָoffer���Ż����㷨
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum < 3)
            return list;
        ArrayList<Integer> l = new ArrayList<Integer>();
        int small = 2;
        int middle = (1 + sum) / 2;//��Ϊ��������2����˳�����ӣ�����ȡ�м�ֵ
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
            //����ָ�룬���󣬼�ȥ������֣���С�����ұ�����
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
