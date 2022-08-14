import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {

    @Test
    public void shouldCountCompressions() {
        String str = "aabcccccaaa";
        int count = Exercise5.countCompression(str);
        Assertions.assertEquals(8, count);
    }

    @Test
    public void shouldReturnCorrectCompressedString() {
        String str = "aabcccccaaa";
        String compressedStr = Exercise5.compress(str);
        Assertions.assertEquals("a2b1c5a3", compressedStr);
    }

    @Test
    public void shouldReturnSameStringIfCompressionIsNotSmallerThanOriginal() {
        String str = "aabbccaa";
        String compressedStr = Exercise5.compress(str);
        Assertions.assertEquals("aabbccaa", compressedStr);
    }

    @Test
    public void shouldReturnEmptyStringOnEmptyInput() {
        String str = "";
        String compressedStr = Exercise5.compress(str);
        Assertions.assertEquals("", compressedStr);
    }

}