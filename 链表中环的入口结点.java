package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月5日 下午7:46:19
* 类说明: 
*/
public class 链表中环的入口结点 {
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return null;
		}
		// 需要先判断是否有环 
		ListNode n1 = pHead; // 每次走一步
		ListNode n2 = pHead; // 每次走两步
		ListNode n = null; // 记录n1 n2 遇到的节点
		
		// 使用双指针法
		while (n2 != null && n2.next != null) {
			n2 = n2.next.next;
			n1 = n1.next;
			if (n1 == n2) {
				n = n1;
				break;
			}
		}
		// 求出环中的节点数量
		int num = 1;
		ListNode temp = n.next;// n的镜像节点
		
		while (temp != n) {
			temp = temp.next;
			num++;
		}
		ListNode node1 = pHead;
		ListNode node2 = pHead;
		// 画图 就明白卡了
		// node1 先走num步， 然后两个人一起走，他们第一次相遇的地方就是入口节点
		for (int i = 0; i < num; i++) {
			node1 = node1.next;
		}
		int num1 = 0;
		
		while (node1 != node2) {
			node1 = node1.next;
			node2 = node2.next;
			num1++;
		}
		
		return node1;
		
	}
}
