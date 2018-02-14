package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月10日 下午6:09:58
* 类说明: 开始的时候，没有考虑到这些限制，结果是bugbugbug
*/
public class 顺时针打印矩阵 {

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
		int start = 0; // 标志，打印的层数
		while (rows > 2*start && cols > 2*start) {
			printCircle(list, matrix, rows, cols, start);
			start++;
		}
		return list;
	}
	public static void printCircle(ArrayList<Integer> list, int[][] matrix,int rows, int cols, int start) {
		
		// 
		int  endX = cols - 1 - start; // 第一圈
		int endY = rows - 1 - start;
		// 从左到右 第一行没有要求
		for (int i = start; i <= endX; i++) {
			list.add(matrix[start][i]);
		}
		
		// 从上到下打印一列，至少需要两列
		if (start < endY) {
			for (int j = start + 1; j <= endY; j++) {
				list.add(matrix[j][endX]);
			}
		}
		// 从左往右 打印一行，至少需要两行两列
		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; i--) {
				list.add(matrix[endY][i]);
			}
		}
		// 从下往上，打印一列， 至少需要三行两列 ，
		if (start < endY - 1 && start < endX) {
			for (int j = endY - 1; j >= start + 1; j--){
				list.add(matrix[j][start]);
			}
		}
	}

}
