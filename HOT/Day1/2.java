//2. 两数相加
//https://leetcode.cn/problems/add-two-numbers

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
            ListNode head = null;
            ListNode tail = null;
            int tmp = 0;
            while(l1!null || l2!=null) {
                int n1 = l1==null ? 0 :l1.val;
                int n2 = l2==null ? 0 : l2.val;
                int sum =n1+n2+tmp;
                if(head==null) {
                    head = tail = new ListNode(sum%10);
                }else {
                    tail.next = new ListNode(sum%10);
                    tail =tail.next;               
                }
                if(l1!=null) {
                    l1 = l1.next;
                }
                if(l2!=null) {
                    l2 = l2.next;
                }
                tmp = sum/10;
            }
            if(tmp!=0){
                tail.next = new ListNode(tmp);
            }
            return head;

    }
}