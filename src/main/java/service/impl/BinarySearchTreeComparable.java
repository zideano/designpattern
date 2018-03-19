package service.impl;

import service.DataStorage;

public class BinarySearchTreeComparable extends DataStorage<Comparable> {
    private BinarySearchTreeComparable left;
    private BinarySearchTreeComparable right;
    private Comparable root;

    public BinarySearchTreeComparable(Comparable root) {
        this.root = root;
    }

    /**
     * Add new root to our binary tree
     *
     * @param data
     */
    public void insert(Comparable data) {
        int comp = data.compareTo(this.root);

        if (comp < 0) {
            if (left == null) {
                left = new BinarySearchTreeComparable(data);
            } else {
                left.insert(data);
            }
        } else if (comp == 0) {
            System.out.println(data + " is already in the BST");
        } else {
            if (right == null) {
                right = new BinarySearchTreeComparable(data);
            } else {
                right.insert(data);
            }
        }
    }

    /**
     * This method checks for the respective root type
     * then search the binary tree for the root.
     *
     * @param data to be searched for in the binary tree
     * @return true if root is found otherwise return false;
     */
    public boolean find(Comparable data) {
        return false;
    }

    /**
     * Traverse the binary tree using the inorder traversal
     * procedure, traveling from the left node, root node to
     * the right node.
     *
     *              (root)
     *              /    \
     *             /      \
     *            /        \
     *           /          \
     *         (left)       (right)
     */
    public void traverse() {
        if (left != null) {
            left.traverse();
        }

        System.out.println(this.root);

        if (right != null) {
            right.traverse();
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTreeComparable{" +
                "left=" + left +
                ", right=" + right +
                ", root=" + root +
                '}';
    }
}
