import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    public void shouldFailOnEmptyStrings() {
        String testString = "";
        Assertions.assertFalse(Exercise1.checkIfStringHasAllUniqueCharacters(testString));
    }

    @Test
    public void shouldFailOnStringsWithOnlyOneCharacter() {
        String testString1 = "aaaaaaa";
        String testString2 = "zzzz";
        Assertions.assertFalse(Exercise1.checkIfStringHasAllUniqueCharacters(testString1));
        Assertions.assertFalse(Exercise1.checkIfStringHasAllUniqueCharacters(testString2));
    }

    @Test
    public void shouldFailOnStringsWithDuplicateCharacters() {
        String testString1 = "apples";
        String testString2 = "oreos";
        Assertions.assertFalse(Exercise1.checkIfStringHasAllUniqueCharacters(testString1));
        Assertions.assertFalse(Exercise1.checkIfStringHasAllUniqueCharacters(testString2));
    }

    @Test
    public void shouldPassOnStringsOnlyUniqueCharacters() {
        String testString1 = "abcdefgh";
        String testString2 = "zyxwvu";
        Assertions.assertTrue(Exercise1.checkIfStringHasAllUniqueCharacters(testString1));
        Assertions.assertTrue(Exercise1.checkIfStringHasAllUniqueCharacters(testString2));
    }

}