package org.example.java.binaryTree;

public class MinDepthOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDepth(TreeNode root) {
        return root == null ? 0 : depth(root);
    }

    private int depth(TreeNode current) {
        if (current == null) return Integer.MAX_VALUE; // to prevent selection
        if(current.left == null && current.right == null) return 1;
        return 1 + Math.min(depth(current.left), depth(current.right));
    }
}
