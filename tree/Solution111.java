package tree;

class Solution111 {
    int answer = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        return dfs(root, 1);
    }

    public int dfs(TreeNode root, int depth) {
        if (root == null)
            return answer;

        if (root.left == null && root.right == null) {
            answer = Math.min(depth, answer);
            return answer;
        }

        int left = dfs(root.left, depth + 1);
        int right = dfs(root.right, depth + 1);

        return Math.min((Math.min(left, right)), answer);
    }

}
