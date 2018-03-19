package service;

public abstract class DataStorage<T> {
    /**
     * Add new root to our binary tree
     *
     * @param data
     */
    public abstract void insert(T data);

    /**
     * This method checks for the respective root type
     * then search the binary tree for the root.
     *
     * @param data to be searched for in the binary tree
     * @return true if root is found otherwise return false;
     */
    public abstract boolean find(T data);

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
    public abstract void traverse();
}
