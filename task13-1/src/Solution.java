import java.util.HashSet;
import java.util.List;

/**
 * @author Kylin
 * @version v1.0
 * @project leetcode21
 * @date 2021/1/24 0024
 */
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if (set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNodea0=new ListNode(4);
        ListNode listNodea1=new ListNode(1);
        ListNode listNodea2=new ListNode(8);
        ListNode listNodea3=new ListNode(4);
        ListNode listNodea4=new ListNode(5);
        listNodea0.next=listNodea1;
        listNodea1.next=listNodea2;
        listNodea2.next=listNodea3;
        listNodea3.next=listNodea4;
        ListNode headA = listNodea0;

        ListNode listNodeb0=new ListNode(5);
        ListNode listNodeb1=new ListNode(6);
        ListNode listNodeb2=new ListNode(1);
        ListNode listNodeb3=new ListNode(8);
        ListNode listNodeb4=new ListNode(4);
        ListNode listNodeb5=new ListNode(5);
        listNodeb0.next=listNodeb1;
        listNodeb1.next=listNodeb2;
        listNodeb2.next=listNodeb3;
        listNodeb3.next=listNodeb4;
        listNodeb4.next=listNodeb5;
        ListNode headB = listNodeb0;

        getIntersectionNode(headA,headB);

    }
}
