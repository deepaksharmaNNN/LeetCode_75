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
    public int maxLevelSum(TreeNode root) {
        if(root.left == null && root.right == null) return 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxLevel = 0;
        int currLevel = 0;
        long maxSum = Integer.MIN_VALUE;
        while(q.size() > 0){
            int size = q.size();
            currLevel++;
            int currSum = 0;
            while(size-- > 0){
                TreeNode curr = q.poll();
                currSum += curr.val;
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(currSum > maxSum){
                maxSum = currSum;
                maxLevel = currLevel;
            }
        }
        return maxLevel;
    }
}