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
        
        if(root==null)
            return new ArrayList<>();
        
        Queue<TreeNode> bfs=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        bfs.offer(root);
        

        while(!bfs.isEmpty()){
            int len=bfs.size();
            TreeNode right=null;

            

            for(int i=0;i<len;i++){
                TreeNode node=bfs.poll();
                if(node!=null){
                    right=node;
                    bfs.offer(node.left);
                    bfs.offer(node.right);
                }
            }
            if(right!=null){
                result.add(right.val);
            }
        }

        return result;
    }
}
