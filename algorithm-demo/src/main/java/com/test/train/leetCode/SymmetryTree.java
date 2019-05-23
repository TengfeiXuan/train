package com.test.train.leetCode;

import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class SymmetryTree {
    public static void main(String[] args) {

    }

    private static boolean isSymmetry(TreeNode treeNode) {
        if (Objects.isNull(treeNode)) {
            return true;
        }
        return isSy(treeNode.left, treeNode.right);
    }

    private static boolean isSy(TreeNode t1, TreeNode t2) {
        if (Objects.isNull(t1) && Objects.isNull(t2)) {
            return true;
        }
        if (Objects.isNull(t1) || Objects.isNull(t2)) {
            return false;
        }
        return t1.val == t2.val && isSy(t1.left, t2.right) && isSy(t1.right, t2.left);
    }
}
