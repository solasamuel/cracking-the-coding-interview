import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {

    @Test
    public void testNonPalindrome() {
        /* Arrange */
        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);

        /* Act */
        boolean result = Exercise7.isPalindromatic(n1);

        /* Assert */
        Assertions.assertFalse(result);
    }

    @Test
    public void testPalindrome() {
        /* Arrange */
        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);
        n1.appendToTail(1);
        n1.appendToTail(7);

        /* Act */
        boolean result = Exercise7.isPalindromatic(n1);

        /* Assert */
        Assertions.assertTrue(result);
    }

}