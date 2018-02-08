package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月8日 下午9:44:23
* 类说明: /*
利用二维数组由上到下，由左到右递增的规律，
那么选取右上角或者左下角的元素a[row] [col]与target进行比较，
当target小于元素a[row] [col]时，那么target必定在元素a所在行的左边,
即col--；
当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
即row++；
*/
public class 二维数组查找 {

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
