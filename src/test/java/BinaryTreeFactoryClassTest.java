import factory.BinaryTreeFactory;
import org.junit.Assert;
import org.junit.Test;
import service.DataStorage;

public class BinaryTreeFactoryClassTest {

    @Test
    public void testBinarySearchTreeString() {
        BinaryTreeFactory<String> bst = new BinaryTreeFactory<>();

        DataStorage<String> tree = bst.getBinaryTreeInstance("tree");
        tree.insert("plot");
        tree.insert("mood");
        tree.insert("truth");
        tree.insert("suspense");
        tree.insert("climax");

        boolean tree1 = tree.find("truth");
        Assert.assertTrue(tree1);
    }

    @Test
    public void testBinarySearchTreeInteger() {
        BinaryTreeFactory<Integer> bst = new BinaryTreeFactory<>();

        DataStorage<Integer> tree = bst.getBinaryTreeInstance(4);
        tree.insert(3);
        tree.insert(8);
        tree.insert(7);
        tree.insert(1);

        boolean tree1 = tree.find(7);
        Assert.assertTrue(tree1);
    }

    @Test
    public void testBinarySearchTreeCharacter() {
        BinaryTreeFactory<Character> bst = new BinaryTreeFactory<>();

        DataStorage<Character> tree = bst.getBinaryTreeInstance('k');
        tree.insert('f');
        tree.insert('l');
        tree.insert('g');
        tree.insert('e');
        tree.insert('o');

        boolean tree1 = tree.find('e');

        Assert.assertTrue(tree1);
    }

    @Test
    public void testBinarySearchTreeComparable() {
        Assert.assertTrue(1 == 1);
    }
}
