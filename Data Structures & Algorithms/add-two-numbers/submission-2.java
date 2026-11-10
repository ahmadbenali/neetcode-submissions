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

        ListNode dummy=new ListNode(0);
        dummy.next=l1;
        ListNode l3=dummy;
        
        int carry=0;

        while(l1!=null || l2!=null){
            int x=(l1!=null) ? l1.val : 0;
            int y=(l2!=null) ? l2.val : 0;
            
            int sum=x+y+carry;
            int rightdigi=sum%10;
            carry=sum/10;

            ListNode new_node=new ListNode(rightdigi);
            l3.next=new_node;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            l3=l3.next;
        }
        if(carry!=0){
            ListNode lastnode=new ListNode(carry);
            l3.next=lastnode;
        }

        return dummy.next;
    }
}
