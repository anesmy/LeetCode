package org.example.java.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leafValueSequence(root1).equals(leafValueSequence(root2));
    }

    private List<Integer> leafValueSequence(TreeNode root) {
        List<Integer> sequence = new ArrayList<>();
        if(root == null) return sequence;

        if(isLeaf(root)){
            sequence.add(root.val);
            return sequence;
        }

        sequence.addAll(leafValueSequence(root.left));
        sequence.addAll(leafValueSequence(root.right));
        return sequence;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

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
}


// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75