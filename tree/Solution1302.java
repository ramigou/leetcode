package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1302 {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;

        int ans = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int currNodeCnt = queue.size();
            ans = 0;

            for (int i = 0; i < currNodeCnt; i++) {
                TreeNode temp = queue.poll();
                ans += temp.val;

                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }
        }

        return ans;
    }
}
