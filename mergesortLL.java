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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
    public ListNode getmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode node= new ListNode(1);
        ListNode tail=node;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                tail.next=new ListNode(l2.val);
                l2=l2.next;
            }
            tail=tail.next;
        }
        while(l1!=null){
            tail.next=new ListNode(l1.val);
            tail=tail.next;
            l1=l1.next;
        }
         while(l2!=null){
            tail.next=new ListNode(l2.val);
                        tail=tail.next;

                l2=l2.next;
        }
        return node.next;
    }
}
