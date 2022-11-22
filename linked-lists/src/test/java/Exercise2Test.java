import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    public void shouldReturnNullWhenKIsZero() {
        // arrange list [6, 7, 8, 9]
        Node head = new Node(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);

        // act
        Node result = Exercise2.findKthToTheLastElement(head, 0);

        // assert kth to the last element
        Assertions.assertNull(result);
    }

    @Test
    public void shouldReturnLastElementWhenKIsOne() {
        // arrange list [6, 7, 8, 9]
        Node head = new Node(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);

        // act
        Node result = Exercise2.findKthToTheLastElement(head, 1);

        // assert kth to the last element
        Assertions.assertEquals(9, result.data);
    }

    @Test
    public void shouldReturnFirstElementWhenKIsSize() {
        // arrange list [6, 7, 8, 9]
        Node head = new Node(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);

        // act
        Node result = Exercise2.findKthToTheLastElement(head, 4);

        // assert kth to the last element
        Assertions.assertEquals(6, result.data);
    }

}