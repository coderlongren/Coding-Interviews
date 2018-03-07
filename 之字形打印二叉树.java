package ��ָoffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��6�� ����8:19:59
* ��˵��: 
*/
public class ֮���δ�ӡ������ {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		// ��leetcode�ϵ���һ���� ʮһ��һ����
		// ά������ջ�� һ������ҳ� ��һ���ҽ����
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(pRoot);
		
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			ArrayList<Integer> temp = new ArrayList<>();
			while (!stack1.isEmpty()) {
				TreeNode node = stack1.pop();
				if (node.right != null) {
					stack2.push(node.right);
				}
				if (node.left != null) {
					stack2.push(node.left);
				}
			}
			if (temp.size() > 0) {
				res.add(new ArrayList<>(temp));
			}
			
			temp.clear();
			while (!stack2.isEmpty()) {
				TreeNode node = stack2.pop();
				if (node.left != null) {
					stack2.push(node.left);
				}
				if (node.right != null) {
					stack2.push(node.right);
				}
			}
			if (temp.size() > 0) {
				res.add(new ArrayList<>(temp));
			}
		}
		return res;
	}
	
	// ��һ�ַ������� ����α�����ӡ����, ���һ���ж� �������
	public ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return res;
        }
        boolean leftRight = true;
        Queue<TreeNode> layer = new LinkedList<>();
        ArrayList<Integer> layerList = new ArrayList<>();
        layer.offer(pRoot);
        int start = 0,end = 1;
        
        while (!layer.isEmpty()) {
        	TreeNode node = layer.poll();
        	layerList.add(node.val);
        	start++;
        	if (node.left != null) {
        		layer.offer(node.left);
        	}
        	if (node.right != null) {
        		layer.offer(node.right);
        	}
        	
        	if (start == end) {
        		if (leftRight) {
        			res.add(new ArrayList<>(layerList));
        		}
        		else {
        			res.add(reverse(layerList));
        		}
        	}
        	start = 0;
        	end = layerList.size();
        	leftRight = !leftRight;
        	layerList.clear();
        }
        return res;
	}
	public ArrayList reverse(ArrayList<Integer> layerList) {    
        int length = layerList.size();
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for(int i = length-1; i >= 0;i--){
            reverseList.add(layerList.get(i));
        }
        return reverseList;
    }
	public static void main(String[] args) {
		user u1 = new user(1, " sss");
		user u2 = new user(1, "sdfs");
		
		Set<user> set = new HashSet<>();
		set.add(u1);
		set.add(u2);
		System.out.println(set.add(u2));
		System.out.println(set.size());
	}
}
class user{
	private long id;
	private String name;
	public user(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	    return 5;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 if(obj==null){
	            return false;
	        }
	        if(obj!=null && obj.getClass() == this.getClass()){
//	            user u1 = (user) obj;
	            return this.id == ((user)obj).id;
	        }
	        return super.equals(obj);
	}
}
