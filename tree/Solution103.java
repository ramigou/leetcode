package tree;

import java.util.*;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            ArrayList<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.poll();
                levelList.add(temp.val);

                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }

            ans.add(levelList);
        }

        int ansLength = ans.size();
        for (int i = 0; i < ansLength; i++) {
            if (i % 2 == 0) continue;
            Collections.reverse(ans.get(i));
        }

        return ans;
    }
}
