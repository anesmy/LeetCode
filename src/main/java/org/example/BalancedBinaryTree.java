package org.example;

public class BalancedBinaryTree {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) &&
                Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private int depth(TreeNode current){
        if (current == null) return 0;
        else return 1 + Math.max(depth(current.left), depth(current.right));
    }
}
