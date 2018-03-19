package factory;

import service.DataStorage;
import service.impl.BinarySearchTreeCharacter;
import service.impl.BinarySearchTreeComparable;
import service.impl.BinarySearchTreeInteger;
import service.impl.BinarySearchTreeString;

/**
 * Binary Search Tree Factory Class that implements a single
 * method getBinaryTreeInstance and returns the respective
 * BST depending on the generic parameter type.
 *
 * @param <T>
 */
public class BinaryTreeFactory<T> {

    /**
     *
     * @param tree
     * @return particular
     */
    public DataStorage<T> getBinaryTreeInstance(T tree) {
        if (tree instanceof Integer) {
            return (DataStorage<T>) new BinarySearchTreeInteger((Integer) tree);
        } else if (tree instanceof String) {
            return (DataStorage<T>) new BinarySearchTreeString((String) tree);
        } else if (tree instanceof Character) {
            return (DataStorage<T>) new BinarySearchTreeCharacter((Character) tree);
        } else if (tree instanceof Comparable) {
            return (DataStorage<T>) new BinarySearchTreeComparable((Comparable) tree);
        } else {
            throw new IllegalArgumentException("Unsupported Data Type for BST");
        }
    }
}
