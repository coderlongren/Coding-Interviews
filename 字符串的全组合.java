package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��14�� ����9:12:54
* ��˵��: 
*/
public class �ַ�����ȫ��� {
	public  static List<List<Character>> combination(char[] chars) {
		List<List<Character>> list = new ArrayList<>();
		
		backtracking(list,new ArrayList<>(), chars,0);
		return list;
	}

	private static void backtracking(List<List<Character>> list,List<Character> temp, char[] chars,int start) {
		if (temp.size() > 0) {
			list.add(new ArrayList<>(temp));
		}
		for (int i = start; i < chars.length; i++) {
			if (!temp.contains(chars[i])) {
				temp.add(chars[i]);
				backtracking(list, temp, chars,i + 1);
				temp.remove(temp.size() - 1);
				
			}
			else {
				continue;
			}
		}
	}
	public static void main(String[] args) {
		char[] chars = {'a','b','c'};
		System.out.println(combination(chars));
	}
}
