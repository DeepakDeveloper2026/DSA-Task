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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inOrder(root,ls);
        return ls;
    }
    public List<Integer> inOrder(TreeNode root,List<Integer> ls){
        if(root==null){
            return ls;
        }
        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
        return ls;
    }
}