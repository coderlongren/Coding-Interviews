package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��8�� ����9:44:23
* ��˵��: /*
���ö�ά�������ϵ��£������ҵ����Ĺ��ɣ�
��ôѡȡ���Ͻǻ������½ǵ�Ԫ��a[row] [col]��target���бȽϣ�
��targetС��Ԫ��a[row] [col]ʱ����ôtarget�ض���Ԫ��a�����е����,
��col--��
��target����Ԫ��a[row][col]ʱ����ôtarget�ض���Ԫ��a�����е��±�,
��row++��
*/
public class ��ά������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean Find(int[][] array, int target) {
		int row = 0;
		int col = array[0].length - 1;
		while (row < array.length && col >= 0) {
			if (target == array[row][col]) {
				return true;
			}
			else if (target > array[row][col]) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}

}
