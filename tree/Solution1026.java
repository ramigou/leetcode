package tree;

class Solution1026 {
    public int dfs(TreeNode root, int min, int max) {
        if (root == null) return max - min;

        int subMin = Math.min(min, root.val);
        int subMax = Math.max(max, root.val);

        int left = dfs(root.left, subMin, subMax);
        int right = dfs(root.right, subMin, subMax);

        return Math.max(left, right);
    }
}
