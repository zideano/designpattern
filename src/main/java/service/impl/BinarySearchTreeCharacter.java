package service.impl;

import service.DataStorage;

public class BinarySearchTreeCharacter extends DataStorage<Character> {
    private BinarySearchTreeCharacter left;
    private BinarySearchTreeCharacter right;
    private Character root;

    public BinarySearchTreeCharacter(Character root) {
        this.root = root;
    }

    /**
     * Add new root to our binary tree
     *
     * @param data
     */
    public void insert(Character data) {
        int comp = data.compareTo(this.root);

        if (comp < 0) {
            if (left == null) {
                left = new BinarySearchTreeCharacter(data);
            } else {
                left.insert(data);
            }
        } else if (comp == 0) {
            System.out.println(data + " is already in the BST");
        } else {
            if (right == null) {
                right = new BinarySearchTreeCharacter(data);
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
    public boolean find(Character data) {
        int comp = data.compareTo(this.root);

        if (comp == 0) {
            return true;
        } else if (comp < 0) {
            if (left == null) {
                return false;
            } else {
               return left.find(data);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.find(data);
            }
        }
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
        return "BinarySearchTreeCharacter{" +
                "left=" + left +
                ", right=" + right +
                ", root=" + root +
                '}';
    }
}
