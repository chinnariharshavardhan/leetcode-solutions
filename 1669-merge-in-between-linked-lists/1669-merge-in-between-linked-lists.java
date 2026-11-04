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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list1;
        ListNode st=list1;
        ListNode end=list1;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        for(int i=0;i<a-1;i++){
            st=st.next;
        }
        for(int i=0;i<b;i++){
            end=end.next;
        }
        ListNode l2st=list2;
        ListNode l2end=list2;
        while(l2end.next!=null){
            l2end=l2end.next;
        }
        st.next=l2st;
        l2end.next=end.next;


        return head;
    }
}