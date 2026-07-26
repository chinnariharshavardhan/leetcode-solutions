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
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode node=new ListNode(1);
        ListNode tail=node;
        while(first!=null && second!=null){
            if(first.val<second.val){
                tail.next=new ListNode(first.val);
                first=first.next;
            }else{
                tail.next=new ListNode(second.val);
                second=second.next;
            }
            tail=tail.next;
        }
        while(first!=null){
            tail.next=new ListNode(first.val);
             tail=tail.next;
                first=first.next;
        }
        while(second!=null){
            tail.next=new ListNode(second.val);
            tail=tail.next;
                second=second.next;
        }
        return node.next;
    }

}