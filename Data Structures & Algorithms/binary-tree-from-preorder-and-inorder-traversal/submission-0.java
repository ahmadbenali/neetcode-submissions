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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0)
            return null;

        TreeNode root=new TreeNode(preorder[0]);

        int mid=-1;
        int len=inorder.length;
        for(int i=0;i<len;i++){
            if(inorder[i]==root.val){
                mid=i;
                break;
            }
        }

        int[] leftpreorder = Arrays.copyOfRange(preorder , 1 , mid+1);
        int[] leftinorder  = Arrays.copyOfRange(inorder , 0 , mid);
        root.left=buildTree(leftpreorder,leftinorder);

        int[] rightpreorder = Arrays.copyOfRange(preorder , mid+1 , len);
        int[] rightinorder  = Arrays.copyOfRange(inorder , mid+1 , len);
        root.right=buildTree(rightpreorder,rightinorder);

        return root;

    }
}
