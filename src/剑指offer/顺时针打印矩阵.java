package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��10�� ����6:09:58
* ��˵��: 
*/
public class ˳ʱ���ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int rows = matrix.length; 
		int cols = matrix[0].length;
		
		if (matrix == null || cols <= 0 || rows <= 0){
			return null;
		}
		int start = 0; // ��־����ӡ�Ĳ���
		while (rows > 2*start && cols > 2*start) {
			printCircle(list, matrix, rows, cols, start);
			start++;
		}
	}
	public void printCircle(ArrayList<Integer> list, int[][] matrix,int rows, int cols, int start) {
		
		// 
		int  endX = cols - 1 - start; // ��һȦ
		int endY = rows - 1 - start;
		// ������ ��һ��
		for (int i = start; i <= endX; i++) {
			list.add(matrix[start][i]);
		}
		// ���ϵ��£���һ��
		for (int j = start; j <= endY; j++) {
			list.add(matrix[j][start]);
		}
		for (int i = )
		
	}

}
