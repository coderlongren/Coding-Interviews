package 剑指offer;

import java.util.LinkedHashMap;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月17日 下午10:34:58
* 类说明: 
*/
public class 第一次只出现一次的字符 {
	// Array计数方法
	public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) {
            return  -1;
        }
        char c = 'A';
        if(str.charAt(0) >= 'a'){
            c = 'a';
        }
        int[] counts = new int[26];
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (counts[str.charAt(i) - c] == 1){
                return i;
            }
        }
        return -1;
    }
	// hashMap方法
	public int FirstNotRepeatingChar2(String str) {
		// LinkHashMap 是插入顺序
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i), ++time);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }
        int pos = -1;  
        int i=0;
        for(;i<str.length();i++){
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }
}
