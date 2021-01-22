/**
 * @author Kylin
 * @version v1.0
 * @project leetcode21
 * @date 2021/1/22 0022
 */
public class Solution {
    private int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        return root.val + left + right;
    }

    int helper(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        return root.val + Math.max(left, right);
    }
}
