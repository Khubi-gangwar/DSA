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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode Oddhead = new ListNode(-1);
        ListNode Evenhead = new ListNode(0);
        ListNode tempO = Oddhead;
        ListNode tempE = Evenhead;
        while(temp != null) {
            tempO.next = temp;
            tempO = tempO.next;
            temp = temp.next;
            tempE.next = temp;
            if(temp == null) break;
            tempE = tempE.next;
            temp = temp.next;
        }
        Oddhead = Oddhead.next;
        Evenhead = Evenhead.next;
        tempO.next = Evenhead;
        return Oddhead;
    }
}