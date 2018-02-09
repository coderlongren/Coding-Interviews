package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午5:00:59
* 类说明:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
*  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
* 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
*/
public class 旋转数组的最小数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5,0,1,2};
		System.out.println(minNumberInRotateArray(array));
	}
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;// 数组长度为0 不合法
		}
		
		int left = 0;// 处理的第一个元素
		int right = array.length - 1;
		int mid = left;
		
		while (array[left] >= array[right]) {
			// 当right - left = 1 后一个是结果
			if (right - left == 1) {
				return array[right];
			}
			mid = (left + right)/2;
			
			if (array[mid] == array[left] && array[left] == array[right]) {
				return minNum(array, left, right);
			}
			// 最小值 在后半部分
			else if (array[left] >= array[mid]) {
				right = mid;
			}
			else {
				left = mid;
			}
			
		}
		return array[mid];
		
	}
	// 顺序查找最小元素
	public static int minNum(int[] array, int left, int right) {
		int min = array[left];
		while (left <= right) {
			min = Math.min(min, array[left++]);
		}
		return min;
	}
	 
}
