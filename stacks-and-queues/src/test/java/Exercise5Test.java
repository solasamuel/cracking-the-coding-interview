import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    public void testMyQueue() {
        Exercise5.MyQueue queue = new Exercise5.MyQueue();

        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(0);

        int result = (int) queue.remove();

        Assertions.assertEquals(4, result);

    }

}