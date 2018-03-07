package ��ָoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����7:48:57
* ��˵��: 
*/
public class �������ڵ����ֵ {
	public ArrayList<Integer> maxInWindows(int [] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		if (num == null) {
			return list;
		}
		
		if (num.length < size || size < 1) {
			return list;
		}
		
		// ������������ǻ����������ֵ�����ֵ��±�
		LinkedList<Integer> indexDeque = new LinkedList<>();
		for (int i = 0; i < size - 1; i++) {
			// �����������С�ڴ����������
		}
		return list;
	}
	public static ArrayList<Integer> maxInWindows2(int [] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> data = new ArrayList<>();
		for (int i : num) {
			data.add(i);
		}
		if (num == null) {
			return list;
		}
		
		if (num.length < size || size < 1) {
			return list;
		}
		Deque<Integer> idx = new LinkedList<>();
		// ���ڻ�û��������ʱ������������
		for (int i = 0; i < size && i < num.length; i++) {
			while (!idx.isEmpty() && data.get(i) > idx.getLast()) {
				idx.removeLast(); // �Ƴ���β���������
			}
			// �������
			idx.addLast(i); // �ڶ�β�������
		}
		
		// �����ڱ�������ʱ��
		for (int i = size; i < data.size(); i++) {
			// ��һ�����������������ֵ
			list.add(idx.getFirst()); // ����Ԫ�� ��Զ������
			
			// ���������Ӧ�� ֵ ��֮ǰ������ֵ��Ӧ��ֵ�������ȣ���ɾ��֮ǰ�洢��ֵ
			while (!idx.isEmpty() && data.get(i) > data.get(idx.getLast())) {
				idx.removeLast();
			}
			// ɾ���Ѿ����� ���ڵ����ݶ�Ӧ���±�
			while (!idx.isEmpty() && idx.getFirst() <= (i - size)) {
				idx.removeFirst();
			}
			
			idx.addLast(i);
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		int[] nums = {2,3,4,2,6,2,5,1};
		System.out.println(maxInWindows2(nums, 3));
	}
}
