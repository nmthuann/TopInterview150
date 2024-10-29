package BinaryTrees.impl;

import BinaryTrees.impl.TreeNode;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 8/17/2024
 */
public interface IBinaryTree {
    void PreOrderTraversalNLR(TreeNode treeNode);
    void PostOrderTraversalLRN(TreeNode treeNode);
    void InOrderTraversalLNR(TreeNode treeNode);
    void LevelOrderSearchBFS(TreeNode treeNode);
}
