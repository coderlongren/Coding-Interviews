package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��9�� ����9:40:04
* ��˵��: 
*/
public class ��ӡ1������Nλ�� {
	public static void Print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;

        char[] number = new char[n];

        //ÿһ���ַ���Ϊ0
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }

        while (!Increment(number)) {//����ӷ���������˳��������ӡ����
            PrintNumber(number);
        }

    }

	// �ַ���number��ʾһ�����֣��� number������1
	 // ������ӷ�������򷵻�true������Ϊfalse
	private static boolean Increment(char[] number) {
		boolean isOverflow = false;//�����־
        int nTakeOver = 0;//��λ
        int nLength = number.length;

        for (int i = nLength - 1; i >= 0; i--) {//�Ӻ���ǰ�����һλ���ּ�1
            int nSum = number[i] - '0' + nTakeOver;
            if (i == nLength - 1)
                nSum++;

            if (nSum >= 10) {
                if (i == 0)
                    isOverflow = true;
                else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) ('0' + nSum);
                }
            } else {
                number[i] = (char) ('0' + nSum);
                break;
            }
        }
            return isOverflow;
	}

	 // �ַ���number��ʾһ�����֣����������ɸ�0��ͷ
    // ��ӡ��������֣������Կ�ͷ��0
    public static void PrintNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;

        //��־λ��˼�룬�ӵ�һλ��Ϊ0�����ֿ�ʼ��ӡ����000123����ӡ123
        for (int i = 0; i < nLength; ++i) {
            if (isBeginning0 && number[i] != '0')
                isBeginning0 = false;

            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }
}
