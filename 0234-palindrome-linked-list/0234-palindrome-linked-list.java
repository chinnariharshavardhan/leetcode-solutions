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
    public ListNode midnode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        ListNode next=current.next;
        if(head==null){
            return head;
        }
        while(current!=null){

            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=midnode(head);
        ListNode head2=reverse(mid);
        ListNode revhead=head2;
        while(head!=null && head2!=null){
            if(head.val!=head2.val){
                break;
            }
            head=head.next;
            head2=head2.next;
        }
        reverse(revhead);
        if(head==null || head2==null){
            return true;
        }
        return false;
    }
}