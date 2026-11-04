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
    public int[] nextLargerNodes(ListNode head) {
        ListNode node=head;
        int c=0;
        while(node!=null){
            node=node.next;
            c++;
        }
        int[] ans =new int[c];
        int a=0;
        ListNode ptr1=head;
        
        while(ptr1!=null){
            ListNode ptr2=ptr1.next;
            while(ptr2!=null){
                if(ptr2.val>ptr1.val){
                    ans[a]=ptr2.val;
                    break;
                }
                ptr2=ptr2.next;
            }
            ptr1=ptr1.next;
            a++;
        }
        return ans;

    }
}