import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    public void shouldRotateMatrixClockWise() {
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        int[][] expectedMatrix = new int[][]{{3, 1}, {4, 2}};
//        System.out.println(Arrays.deepToString(matrix));
        Exercise6.rotate(matrix, 2);
//        System.out.println(Arrays.deepToString(matrix));
//        System.out.println(Arrays.deepToString(expectedMatrix));

        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    public void shouldRotateOddMatrix() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedMatrix = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        System.out.println(Arrays.deepToString(matrix));

        Exercise6.rotate(matrix, 3);

        System.out.println(Arrays.deepToString(matrix));

        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }
}