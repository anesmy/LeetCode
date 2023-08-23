package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

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


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> btList = new ArrayList<>();

        if (root != null){
            btList.add(root.val);
            btList.addAll(preorderTraversal(root.left));
            btList.addAll(preorderTraversal(root.right));
        }
        return btList;
    }
}
