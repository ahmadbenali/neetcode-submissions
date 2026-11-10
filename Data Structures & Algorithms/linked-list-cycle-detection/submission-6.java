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
    public boolean hasCycle(ListNode head) {
        ListNode twojump=head;
        ListNode onejump=head;

        

        while(twojump!=null && twojump.next!=null){

            twojump=twojump.next.next;
            onejump=onejump.next;
            
            if(twojump==onejump)return true; 
        }
        return false;
    }
}
