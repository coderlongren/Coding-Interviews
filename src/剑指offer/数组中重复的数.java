package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��26�� ����6:46:13
* ��˵��: 
*/
public class �������ظ����� {
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
