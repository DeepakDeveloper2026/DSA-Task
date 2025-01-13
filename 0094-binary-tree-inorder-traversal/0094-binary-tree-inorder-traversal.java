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
        //solve by recursion

    //     List<Integer> ls=new ArrayList<>();
    //     inOrder(root,ls);
    //     return ls;
    // }
    // public List<Integer> inOrder(TreeNode root,List<Integer> ls){
    //     if(root==null){
    //         return ls;
    //     }
    //     inOrder(root.left,ls);
    //     ls.add(root.val);
    //     inOrder(root.right,ls);
    //     return ls;

    //solve by iteration
    List<Integer> ls=new ArrayList<>();
    stackInOrder(root,ls);
    return ls;
    }
    public void stackInOrder(TreeNode root, List<Integer> ls){
       Stack<TreeNode> stack=new Stack<>();
       TreeNode temp=root;
       while(!stack.isEmpty() || temp!=null){
           if(temp!=null){
            stack.push(temp);
            temp=temp.left;
           }
           else{
            temp=stack.pop();
            ls.add(temp.val);
            temp=temp.right;
           }
       }

    }
}