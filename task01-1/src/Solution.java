/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode result = root;
        int num = 0;
        while (l1 != null || l2 != null||num!=0) {
            if (l1 == null) {
                l1 = new ListNode(0, null);
            }
            if (l2 == null) {
                l2 = new ListNode(0, null);
            }
            ListNode element = new ListNode();
            int sum = l1.val + l2.val;
            if (num == 1) {
                sum++;
            }
            if (sum >= 10) {
                num = 1;
                element.val = sum - 10;
            } else {
                num = 0;
                element.val = sum;
            }
            result.next = element;
            result=element;
            l1 = l1.next;
            l2 = l2.next;
        }
        return root.next;
    }
}