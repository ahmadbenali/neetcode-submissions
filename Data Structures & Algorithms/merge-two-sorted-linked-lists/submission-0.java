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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge=new ListNode();
        ListNode p3=merge;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                p3.next=list1;
                list1=list1.next;
            }else{
                p3.next=list2;
                list2=list2.next;
            }
            p3=p3.next;
        }
        
        if(list1!=null)p3.next=list1;
        else p3.next=list2;

        return merge.next;
    }
}