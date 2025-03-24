import java.util.*;

public class BinaryTreePaths {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) result.add(path + node.val);
        if (node.left != null) dfs(node.left, path + node.val + "->", result);
        if (node.right != null) dfs(node.right, path + node.val + "->", result);
    }
}

