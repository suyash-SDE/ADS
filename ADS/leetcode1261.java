import java.util.*;

class FindElements {
    private Set<Integer> values = new HashSet<>();

    public FindElements(TreeNode root) {
        recover(root, 0);
    }

    private void recover(TreeNode node, int val) {
        if (node == null) return;
        node.val = val;
        values.add(val);
        recover(node.left, 2 * val + 1);
        recover(node.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}

