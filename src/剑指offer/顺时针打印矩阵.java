package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月10日 下午6:09:58
* 类说明: 
*/
public class 顺时针打印矩阵 {

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
		int start = 0; // 标志，打印的层数
		while (rows > 2*start && cols > 2*start) {
			printCircle(list, matrix, rows, cols, start);
			start++;
		}
	}
	public void printCircle(ArrayList<Integer> list, int[][] matrix,int rows, int cols, int start) {
		
		// 
		int  endX = cols - 1 - start; // 第一圈
		int endY = rows - 1 - start;
		// 从左到右 第一行
		for (int i = start; i <= endX; i++) {
			list.add(matrix[start][i]);
		}
		// 从上到下，第一列
		for (int j = start; j <= endY; j++) {
			list.add(matrix[j][start]);
		}
		for (int i = )
		
	}

}
