package ��ָoffer;

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��13�� ����8:06:43
* ��˵��: 
*/
public class �����������ĺ���������� {
	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		int start = 0;
		int end = sequence.length - 1;
		return VerifySquenceOfBST1(sequence, start, end);
	}
	public static boolean VerifySquenceOfBST1(int[] sequence, int start, int end) {
		if (start > end) {
			return true;
		}
		int root = sequence[end];
		int i = start;
		
		// �����������У� �������ڵ��С�ڸ��ڵ�
		for (; i < end; i++) {
			if (sequence[i] > root) {
				break;
			}
		}
		int j = i;
		// BST�У� �������ڵ������ ���ڵ�
		for (; j < end; j++) {
			if (sequence[j] < root) {
				return false;
			}
		}
		boolean left = true;
		boolean right = true;
		if (i > start) {
			left = VerifySquenceOfBST1(sequence, start, i - 1);
		}
		if (i < sequence.length - 1) {
			right = VerifySquenceOfBST1(sequence, i, end - 1);
		}
		return left&&right;
	}
	public static void main(String[] args) {
		int[] sequence = {3,5,4,7,9,8,3};
		System.out.println(VerifySquenceOfBST(sequence));
	}
}
