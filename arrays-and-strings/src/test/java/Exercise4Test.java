import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    public void shouldPassOnStringWithOnlyOneSpace() {
        String str = "Happy days  ";
        char[] str_array = str.toCharArray();
        int len = 10;

        Exercise4.replaceAllSpaces(str_array, len);

        String expectedString = "Happy%20days";
        char[] expectedStringArray = expectedString.toCharArray();

        Assertions.assertArrayEquals(str_array, expectedStringArray);

    }

    @Test
    public void shouldPassOnStringsWithMoreThanOneSpace() {
        String str = "John Smith died a happy man          ";
        char[] str_array = str.toCharArray();
        int len = 27;

        Exercise4.replaceAllSpaces(str_array, len);

        String expectedString = "John%20Smith%20died%20a%20happy%20man";
        char[] expectedStringArray = expectedString.toCharArray();

        Assertions.assertArrayEquals(str_array, expectedStringArray);
    }

}