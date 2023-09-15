package org.example.java.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    // Definition for a binary tree node.
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> btList = new ArrayList<>();

        if (root != null){
            btList.addAll(postorderTraversal(root.left));
            btList.addAll(postorderTraversal(root.right));
            btList.add(root.val);
        }
        return btList;
    }
}
