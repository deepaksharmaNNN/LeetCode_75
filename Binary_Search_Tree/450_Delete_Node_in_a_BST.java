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
    private int getMax(TreeNode root){
        if(root.right == null) return root.val;
        return getMax(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left != null && root.right == null){
                return root.left;
            }else if(root.left == null && root.right != null){
                return root.right;
            }else{//pick maximum from left and replace root with it and then delete that value(not root)
                int max = getMax(root.left);
                root.val = max;
                root.left = deleteNode(root.left, max);
            }
        }
        return root;
    }
}