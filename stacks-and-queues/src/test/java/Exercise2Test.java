import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    public void testAscStack() {
        Exercise2.StackWithMin testStack = new Exercise2.StackWithMin();

        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.pop();

        Assertions.assertEquals(1, testStack.min());
    }

    @Test
    public void testDescStack() {
        Exercise2.StackWithMin testStack = new Exercise2.StackWithMin();

        testStack.push(4);
        testStack.push(3);
        testStack.push(2);
        testStack.push(1);
        testStack.pop();

        Assertions.assertEquals(2, testStack.min());
    }

    @Test
    public void testRandomStack() {
        Exercise2.StackWithMin testStack = new Exercise2.StackWithMin();

        testStack.push(5);
        testStack.push(3);
        testStack.push(8);
        testStack.push(6);
        testStack.pop();

        Assertions.assertEquals(3, testStack.min());
    }

}