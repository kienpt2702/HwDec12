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
import java.util.*;
//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
class Postorder {
    List<Integer> list;
    Stack<TreeNode> stack1;
    Stack<TreeNode> output;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if(root == null) return list;
        stack1 = new Stack<>();
        output = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode parent = stack1.pop();
            if(parent.left != null) stack1.push(parent.left);
            if(parent.right != null) stack1.push(parent.right);
            output.push(parent);
        }
        while(!output.isEmpty()) list.add(output.pop().val);
        return list;
    }

    public List<Integer> postOrderRecursion(TreeNode root){
        list = new ArrayList<>();
        return list;
    }
    private void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }
}