import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise1Test {

    @Test
    public void shouldReturnOneElementWithListOfExactlyTwoDuplicates() {
        // arrange list = [2, 2]
        Node head = new Node(2);
        head.next = new Node(2);

        // act
        Exercise1.removeDuplicates(head);

        // assert list = [2]
        Assertions.assertEquals(2, head.data);
        Assertions.assertNull(head.next);

    }

    @Test
    public void shouldReturnOneElementWithListOfExactlyThreeDuplicates() {
        // arrange list = [2, 2, 2]
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(2);

        // act
        Exercise1.removeDuplicates(head);

        // assert list = [2]
        Assertions.assertEquals(2, head.data);
        Assertions.assertNull(head.next);
    }

    @Test
    public void shouldReturnUniqueElementsWithListOfMultipleDuplicates() {
        // arrange list = [1, 1, 1, 5, 5, 3, 3, 3, 3, 6, 6, 6, 2, 2, 8, 8, 8, 1, 7]
        Node head = new Node(1);
        head.appendToTail(1);
        head.appendToTail(1);
        head.appendToTail(1);
        head.appendToTail(5);
        head.appendToTail(5);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(8);
        head.appendToTail(8);
        head.appendToTail(8);
        head.appendToTail(1);
        head.appendToTail(7);

        // act
        Exercise1.removeDuplicates(head);

        // assert list = [1, 5, 3, 6, 2, 8, 7]
        Node other = new Node(1);
        other.appendToTail(5);
        other.appendToTail(3);
        other.appendToTail(6);
        other.appendToTail(2);
        other.appendToTail(8);
        other.appendToTail(7);

        Assertions.assertTrue(head.equals(other));

    }
}