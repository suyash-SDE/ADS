import java.util.*;

public class ConstructBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    private Map<Integer, Integer> inorderMap;
    private int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int left, int right) {
        if (left > right) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        root.left = construct(preorder, left, inorderMap.get(root.val) - 1);
        root.right = construct(preorder, inorderMap.get(root.val) + 1, right);
        return root;
    }
}
