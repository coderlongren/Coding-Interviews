package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��14�� ����9:29:04
* ��˵��: 
*/
public class �ַ�����ȫ���� {
	public static List<List<Character>> permutation(char[] chars) {
		List<List<Character>> list = new ArrayList<>();
		
		backtracking(list,new ArrayList<>(), chars);
		return list;
	}

	private static void backtracking(List<List<Character>> list, ArrayList temp, char[] chars) {
		if (temp.size() == chars.length) {
			list.add(new ArrayList<>(temp));
		}
		for (int i = 0; i < chars.length; i++) {
			if (temp.contains(chars[i])) {
				continue;
			}
			else {
				temp.add(chars[i]);
				backtracking(list, temp, chars);
				temp.remove(temp.size() - 1);
			}
		}
		
	}
	public static void main(String[] args) {
		char[] chars  = {'a','b','c'};
		System.out.println(permutation(chars));
	}
}
