import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    public void shouldReturnTheSameListIfXisSmallerThanMin() {
        // arrange
        Node head = new Node(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        // act
        Node result = Exercise4.partitionListAroundNum(head, 1);

        // assert
        Node expected = new Node(2);
        expected.appendToTail(3);
        expected.appendToTail(4);
        expected.appendToTail(5);

        Assertions.assertTrue(result.equals(expected));

    }

}