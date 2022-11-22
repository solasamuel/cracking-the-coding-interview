import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    public void testCircularList() {
        /* Arrange */
        Node n1 = new Node(7);
        Node n2 = new Node(5);
        n1.appendNodeToTail(n2);
        n1.appendToTail(1);
        n1.appendToTail(6);
        n1.appendNodeToTail(n2);

        /* Act */
        Node result = Exercise6.findStartOfCircularLinkedList(n1);

        /* Assert */
        Assertions.assertEquals(5, result.data);
    }

}