import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    public void shouldFailIfOnlyOneOfTheStringsAreEmpty() {
        String test1 = "";
        String test2 = "TESTER";
        Assertions.assertFalse(Exercise3.checkIfTwoStringsArePermutations(test1, test2));
    }

    @Test
    public void shouldFailOnStringsOfDifferentLength() {
        String test1 = "TEST";
        String test2 = "TESTER";
        Assertions.assertFalse(Exercise3.checkIfTwoStringsArePermutations(test1, test2));
    }

    @Test
    public void shouldFailOnStringsOfTheSameLengthThatAreNotPermutations() {
        String test1 = "TEST";
        String test2 = "TEFT";
        Assertions.assertFalse(Exercise3.checkIfTwoStringsArePermutations(test1, test2));
    }

    @Test
    public void shouldPassOnPermutations() {
        String test1 = "start";
        String test2 = "artts";
        Assertions.assertTrue(Exercise3.checkIfTwoStringsArePermutations(test1, test2));
    }

}