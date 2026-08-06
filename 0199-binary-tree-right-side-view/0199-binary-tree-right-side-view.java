/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++){
                TreeNode currnode=queue.poll();
                if(i==levelsize-1){
                    ans.add(currnode.val);
                }
                if(currnode.left!=null){
                    queue.offer(currnode.left);
                }
                if(currnode.right!=null){
                    queue.offer(currnode.right);
                }
            }
        }
        return ans;
    }
}

// List<Integer>ans=new ArrayList<>();
//         if(root==null){
//             return ans;
//         }
//         TreeNode node=root;
//         ans.add(root.val);
//         int count=0;
//         while(node.right!=null){
//             ans.add(node.right.val);
//             node=node.right;
//             count+=1;
//         }
//         int res=0;
//         TreeNode n=root;
//         while(n.left!=null){
//             if(res<count){
//                 res+=1;
//                 n=n.left;
//             }else{
//                 ans.add(n.left.val);
//                 n=n.left;
//             }
//         }

//         return ans;