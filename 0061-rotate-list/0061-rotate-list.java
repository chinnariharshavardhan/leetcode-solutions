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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<=0){
            return head;
        }
        ListNode last=head;
        int len=1;
        while(last.next!=null){
            last=last.next;
            len++;
        }
        k = k % len;

        last.next=head;
        int skip=len-k;
        ListNode newlast=head;
        int rot=k%len;
        for(int i=0;i<skip-1;i++){
            newlast=newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        return head;
    }
}