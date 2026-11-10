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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> bfs=new LinkedList<>();
        bfs.add(root);

        
        while(!bfs.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();


            for(int i=bfs.size();i>0;i--){
                TreeNode node=bfs.poll();
                if(node!=null){
                    level.add(node.val);
                    bfs.offer(node.left);
                    bfs.offer(node.right);
                }
            }
            
            if(level.size()>0){
                result.add(level);
            }
        }
        return result;

    }
}
