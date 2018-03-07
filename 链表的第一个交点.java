package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 下午8:24:49
* 类说明: 第一反应就是蛮力法：在第一链表上顺序遍历每个结点。
* 每遍历一个结点的时候，在第二个链表上顺序遍历每个结点。
* 如果此时两个链表上的结点是一样的，说明此时两个链表重合，
* 于是找到了它们的公共结点。如果第一个链表的长度为m，
* 第二个链表的长度为n，显然，该方法的时间复杂度为O(mn)。
*/
public class 链表的第一个交点 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
       if (pHead1 == null||pHead2 == null) {
            return null;
        }
        int count1 = 0;
        ListNode p1 = pHead1;
        while (p1!=null){
            p1 = p1.next;
            count1++;
        }
        int count2 = 0;
        ListNode p2 = pHead2;
        while (p2!=null){
            p2 = p2.next;
            count2++;
        }
        int flag = count1 - count2;
        /// 第一个 链表长一些
        if (flag > 0){
            while (flag>0){
                pHead1 = pHead1.next;
                flag --;
            }
        while (pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    // 第二个链表长一些呢？也可能相等
        if (flag <= 0){
            while (flag<0){
                pHead2 = pHead2.next;
                flag ++;
            }
            while (pHead1 != pHead2){
                pHead2 = pHead2.next;
                pHead1 = pHead1.next;
            }
            return pHead1;
        }
        return null;
    }
}
