package BinaryTrees.impl;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 8/17/2024
 */
public class BinaryTree implements IBinaryTree {
    // Method to insert a value into the BST
    public TreeNode insert(TreeNode root, int val) {
        // Nếu cây rỗng, tạo một nút mới và trả về nó
        if (root == null) {
            return new TreeNode(val);
        }

        // Nếu giá trị nhỏ hơn giá trị của nút hiện tại, chèn vào cây con bên trái
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        // Nếu giá trị lớn hơn giá trị của nút hiện tại, chèn vào cây con bên phải
        else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        // Nếu giá trị bằng giá trị của nút hiện tại, không làm gì cả (tránh chèn giá trị trùng lặp)

        return root;
    }
    @Override
    public void PreOrderTraversalNLR(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            PreOrderTraversalNLR(root.left);
            PreOrderTraversalNLR(root.right);
        }
    }

    @Override
    public void PostOrderTraversalLRN(TreeNode treeNode) {

    }

    @Override
    public void InOrderTraversalLNR(TreeNode root) {
        if (root != null) {
            InOrderTraversalLNR(root.left);
            System.out.println(root.val);
            InOrderTraversalLNR(root.right);
        }

    }

    @Override
    public void LevelOrderSearchBFS(TreeNode treeNode) {

    }
}
