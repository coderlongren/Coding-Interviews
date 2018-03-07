package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��23�� ����9:58:58
* ��˵��: 
*/
public class Լɪ������ {
	// �������
	public static int LastRemaining_Solution1(int n, int m) {
		if(n<1||m<1) return -1;
        int[] array = new int[n];
        int i = -1,step = 0, count = n;
        while(count>0){   //����ѭ��ʱ�����һ��Ԫ��Ҳ����Ϊ��-1
            i++;          //ָ����һ����ɾ���������һ��Ԫ�ء�
            if(i>=n) i=0;  //ģ�⻷��
            if(array[i] == -1) continue; //������ɾ���Ķ���
            step++;                     //��¼���߹��ġ�
            if(step==m) {               //�ҵ���ɾ���Ķ���
                array[i]=-1;
                step = 0;
                count--;
            }        
        }
        return i;//��������ѭ��ʱ��i,�����һ��������Ϊ-1��Ԫ��
	}
	// �������
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
        	// ����ĩβ
        	if (k < 0) {
        		data.remove(data.size() - 1);
        		k = 0;// ����k = 0
        	}
        	else {
        		data.remove(k);
        	}
        }
        return data.get(0);
	}
	// Լɪ�򾭵�ⷨ��O(N)���ռ临�Ӷ�O(1)
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
