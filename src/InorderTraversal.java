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
// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
class InorderTraversal{
    List<Integer> list;
    Stack<TreeNode> nodes;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        nodes = new Stack<>();
        TreeNode currentNode = root;
        while(currentNode != null || !nodes.isEmpty()){
            if(currentNode != null){
                nodes.push(currentNode);
                currentNode = currentNode.left;
            }else{
                currentNode = nodes.pop();
                list.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return list;
    }
    public List<Integer> InorderRecursion(TreeNode root){
        list = new ArrayList<>();

        return list;
    }
    private void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.rigth);
    }

}