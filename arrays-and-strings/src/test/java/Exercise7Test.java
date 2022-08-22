import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {

    @Test
    public void shouldPassOnNxNMatrix() {
        int[][] matrix = new int[][]{{1, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] expectedMatrix = new int[][]{{0, 0, 0}, {0, 0, 0}, {1, 0, 0}};

        Exercise7.setZeros(matrix);

        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    public void shouldPassOnMxNMatrix() {
        int[][] matrix = new int[][]{{1, 1, 0}, {1, 0, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] expectedMatrix = new int[][]{{0, 0, 0}, {0, 0, 0}, {1, 0, 0}, {1, 0, 0}};

        Exercise7.setZeros(matrix);

        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

}