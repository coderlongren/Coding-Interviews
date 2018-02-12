package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月9日 下午10:47:08
* 类说明: 
*/
public class 合并两个有序的链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 递归的解法
	public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null) {
           return list2;
        }
        else if(list2==null) {
           return list1;
        }
        ListNode mergeHead=null;
        if(list1.val<list2.val){
            mergeHead=list1;
            mergeHead.next=Merge(list1.next, list2);
        }
        else{
            mergeHead=list2;
            mergeHead.next=Merge(list1, list2.next);
        }
        return mergeHead;

   }
	// 当然也有非递归的解法
	public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1==null&&list2==null)
            return null;
        if(list1==null&&list2!=null)
            return list2;
        if(list1!=null&&list2==null)
            return list1;
        ListNode head = null;
        if(list1.val<list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        ListNode cur = head;
        cur.next=null;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
            cur.next = null;
        }
        if(list1==null&&list2!=null){
            cur.next =list2;
        }else if(list2==null&&list1!=null){
            cur.next = list1;
        }
        return head;
    }
}
