package factory;

import service.DataStorage;
import service.impl.BinarySearchTreeCharacter;
import service.impl.BinarySearchTreeComparable;
import service.impl.BinarySearchTreeInteger;
import service.impl.BinarySearchTreeString;

public class BinaryTreeFactory<T> {
    public DataStorage<?> getBinaryTree(T tree) {
        if (tree instanceof Integer) {
            return new BinarySearchTreeInteger();
        } else if (tree instanceof String) {
            return new BinarySearchTreeString();
        } else if (tree instanceof Character) {
            return new BinarySearchTreeCharacter();
        } else if (tree instanceof Comparable) {
            return new BinarySearchTreeComparable();
        } else {
            throw new IllegalArgumentException("Unsupported Data Type for BST");
        }
    }
}
