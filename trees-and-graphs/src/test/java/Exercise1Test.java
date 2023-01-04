import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    public void testBalancedBT() {
        // Arrange
        Exercise1.TreeNode root = new Exercise1.TreeNode(1);
        root.left = new Exercise1.TreeNode(2);
        root.right = new Exercise1.TreeNode(3);
        root.left.left = new Exercise1.TreeNode(4);
        root.left.right = new Exercise1.TreeNode(5);
        root.right.right = new Exercise1.TreeNode(6);

        // act
        boolean result = Exercise1.isBalanced(root);

        // assert
        Assertions.assertTrue(result);
    }

    @Test
    public void testUnBalancedBT() {
        // Arrange
        Exercise1.TreeNode root = new Exercise1.TreeNode(1);
        root.left = new Exercise1.TreeNode(2);
        root.right = new Exercise1.TreeNode(3);
        root.left.left = new Exercise1.TreeNode(4);
        root.left.right = new Exercise1.TreeNode(5);
        root.left.left.left = new Exercise1.TreeNode(6);

        // act
        boolean result = Exercise1.isBalanced(root);

        // assert
        Assertions.assertFalse(result);
    }

    @Test
    public void testNullBT() {
        // Arrange
        Exercise1.TreeNode root = null;

        // act
        boolean result = Exercise1.isBalanced(root);

        // assert
        Assertions.assertTrue(result);
    }

}