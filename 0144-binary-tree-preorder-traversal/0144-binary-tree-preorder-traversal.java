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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls =new ArrayList<>();
//BY RECURSION
    //     preOrder(root,ls);
    //     return ls;
    // }
    // public void preOrder(TreeNode root,List<Integer> ls){
    //     if(root==null){
    //         return ;
    //     }
    //     ls.add(root.val);
    //     preOrder(root.left,ls);
    //     preOrder(root.right,ls);
    // }

// by iteration using stack

    preOrderITR(root,ls);
    return ls;
    }
    public void preOrderITR(TreeNode root,List<Integer> ls){
        Stack<TreeNode> st=new Stack<>();
        TreeNode temp=root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                ls.add(temp.val);
                st.push(temp);
                temp=temp.left;
            }
            else{
                temp=st.pop();
                temp=temp.right;
            }
        }
    }
}