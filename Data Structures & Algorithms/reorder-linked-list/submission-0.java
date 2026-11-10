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
    public void reorderList(ListNode head) {
        ListNode slow=head;
    ListNode fast=head;
    
    while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
    
    fast=slow.next;
    slow.next=null;
    
    
    ListNode curr=fast;
    ListNode pre=null;
    
    while(curr!=null){
    ListNode temp=curr.next;
    
    curr.next=pre;
    
    pre=curr;
    curr=temp;
    }
    
    ListNode p1=head;
    ListNode p2=pre;
    //head.next=pre;
    
    
    while(p1!=null && p2!=null){
    ListNode temp1=p1.next;
    ListNode temp2=p2.next;
    
    
    p1.next=p2;
    p2.next=temp1;
    
    
    p2=temp2;
    p1=temp1;
      
    }
    }
}
