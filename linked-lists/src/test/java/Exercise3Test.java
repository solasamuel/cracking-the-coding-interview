import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    public void shouldDeleteMiddleNodeCleanly() {
        // arrange list = [1, 2, 3, 4, 5]
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        // act: delete node
        head.deleteNode(3);

        // assert
        Node other = new Node(1);
        other.appendToTail(2);
        other.appendToTail(4);
        other.appendToTail(5);
        Assertions.assertTrue(head.equals(other));

    }

}