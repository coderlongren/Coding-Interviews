package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午9:40:04
* 类说明: 
*/
public class 打印1到最大的N位数 {
	public static void Print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;

        char[] number = new char[n];

        //每一个字符设为0
        for (int i = 0; i < n; i++) {
            number[i] = '0';
        }

        while (!Increment(number)) {//如果加法溢出，则退出，否则打印数字
            PrintNumber(number);
        }

    }

	// 字符串number表示一个数字，在 number上增加1
	 // 如果做加法溢出，则返回true；否则为false
	private static boolean Increment(char[] number) {
		boolean isOverflow = false;//溢出标志
        int nTakeOver = 0;//进位
        int nLength = number.length;

        for (int i = nLength - 1; i >= 0; i--) {//从后向前，最后一位数字加1
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

	 // 字符串number表示一个数字，数字有若干个0开头
    // 打印出这个数字，并忽略开头的0
    public static void PrintNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;

        //标志位的思想，从第一位不为0的数字开始打印，如000123，打印123
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
