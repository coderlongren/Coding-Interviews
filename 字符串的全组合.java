package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月14日 下午9:12:54
* 类说明: 
*/
public class 字符串的全组合 {
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
