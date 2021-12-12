https://leetcode.com/problems/binary-tree-preorder-traversal/
import java.util.*;
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
class Preorder{
    List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        while(!nodes.isEmpty()){
            TreeNode currentNode = nodes.pop();
            list.add(currentNode.val);
            TreeNode right = currentNode.right;
            TreeNode left  = currentNode.left;
            if(right != null) nodes.push(right);
            if(left != null) nodes.push(left);

        }
        return list;
    }
    public List<Integer> preorderRecursion(TreeNode root){
        list = new ArrayList<>();
        return list;
    }
    private void preorder(TreeNode root){
        if(root == null) return;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}