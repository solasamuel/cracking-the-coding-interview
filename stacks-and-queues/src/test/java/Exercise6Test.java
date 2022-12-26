import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    public void testRandomOrderStack() {
        Stack<Integer> test = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();

        test.push(3);
        test.push(1);
        test.push(4);
        test.push(6);
        test.push(9);
        test.push(11);
        test.push(2);

        result.push(1);
        result.push(2);
        result.push(3);
        result.push(4);
        result.push(6);
        result.push(9);
        result.push(11);

        test = Exercise6.sort(test);

        Assertions.assertEquals(test, result);


    }

}