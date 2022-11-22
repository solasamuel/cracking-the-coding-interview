import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    public void shouldAddCorrectlyWithNoCarry() {
        /* Arrange */
        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);

        Node n2 = new Node(5);
        n2.appendToTail(9);
        n2.appendToTail(2);

        Node expected = new Node(2);
        expected.appendToTail(1);
        expected.appendToTail(9);

        /* Act */
        Node result = Exercise5.addLists(n1, n2, 0);

        /* Assert */
        Assertions.assertTrue(result.equals(expected));

    }

    @Test
    public void shouldAddCorrectlyWithCarry() {
        /* Arrange */
        Node n1 = new Node(9);
        n1.appendToTail(9);
        n1.appendToTail(9);

        Node n2 = new Node(1);

        Node expected = new Node(0);
        expected.appendToTail(0);
        expected.appendToTail(0);
        expected.appendToTail(1);

        /* Act */
        Node result = Exercise5.addLists(n1, n2, 0);

        /* Assert */
        Assertions.assertTrue(result.equals(expected));

    }

    @Test
    public void shouldAddCorrectlyWithNoCarryFollowUp() {
        /* Arrange */
        Node n1 = new Node(6);
        n1.appendToTail(1);
        n1.appendToTail(7);

        Node n2 = new Node(2);
        n2.appendToTail(9);
        n2.appendToTail(5);

        Node expected = new Node(9);
        expected.appendToTail(1);
        expected.appendToTail(2);

        /* Act */
        Node result = Exercise5.addLists2(n1, n2);

        /* Assert */
        Assertions.assertTrue(result.equals(expected));

    }

    @Test
    public void shouldAddCorrectlyWithCarryFollowUp() {
        /* Arrange */
        Node n1 = new Node(9);
        n1.appendToTail(9);
        n1.appendToTail(9);

        Node n2 = new Node(1);

        Node expected = new Node(1);
        expected.appendToTail(0);
        expected.appendToTail(0);
        expected.appendToTail(0);

        /* Act */
        Node result = Exercise5.addLists2(n1, n2);

        /* Assert */
        Assertions.assertTrue(result.equals(expected));

    }

}