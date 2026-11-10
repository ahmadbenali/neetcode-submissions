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
    int pre_inx=0;
    Map<Integer, Integer> indices=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len=preorder.length;
        for(int i=0;i<len;i++)
            indices.put(inorder[i],i);

        return dfs(preorder,0,len-1);
    }

    public TreeNode dfs(int[] preorder, int l, int r){
        if(l>r) return null;

        int root_val=preorder[pre_inx++];//because if you put zero, will keep take first value
        TreeNode root=new TreeNode(root_val);

        int mid=indices.get(root_val);
        root.left=dfs(preorder,l,mid-1);
        root.right=dfs(preorder,mid+1,r);

        return root;
    }
}
