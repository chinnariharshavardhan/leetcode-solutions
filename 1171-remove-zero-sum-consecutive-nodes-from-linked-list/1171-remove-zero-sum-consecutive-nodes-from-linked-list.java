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
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode node=head;
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        for(int i=0;i<list.size();i++){
            int sum=0;
            for(int j=i;j<list.size();j++){
                sum+=list.get(j);
                if(sum==0){
                    list.subList(i,j+1).clear();
                    i--;
                    break;
                }
            }
        }
        if(list.isEmpty()){
    return null;
}
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
             arr[i] = list.get(i);
        }
        ListNode h=new ListNode(arr[0]);
        ListNode t=h;
            for(int i=1;i<arr.length;i++){
                
                ListNode temp=new ListNode(arr[i]);
                t.next=temp;
                t=t.next;
            }
        return h;
    }
}