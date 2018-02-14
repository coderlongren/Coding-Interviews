package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��10�� ����6:09:58
* ��˵��: ��ʼ��ʱ��û�п��ǵ���Щ���ƣ������bugbugbug
*/
public class ˳ʱ���ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		System.out.println(printMatrix(matrix));
	}
	
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
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
		return list;
	}
	public static void printCircle(ArrayList<Integer> list, int[][] matrix,int rows, int cols, int start) {
		
		// 
		int  endX = cols - 1 - start; // ��һȦ
		int endY = rows - 1 - start;
		// ������ ��һ��û��Ҫ��
		for (int i = start; i <= endX; i++) {
			list.add(matrix[start][i]);
		}
		
		// ���ϵ��´�ӡһ�У�������Ҫ����
		if (start < endY) {
			for (int j = start + 1; j <= endY; j++) {
				list.add(matrix[j][endX]);
			}
		}
		// �������� ��ӡһ�У�������Ҫ��������
		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; i--) {
				list.add(matrix[endY][i]);
			}
		}
		// �������ϣ���ӡһ�У� ������Ҫ�������� ��
		if (start < endY - 1 && start < endX) {
			for (int j = endY - 1; j >= start + 1; j--){
				list.add(matrix[j][start]);
			}
		}
	}

}
