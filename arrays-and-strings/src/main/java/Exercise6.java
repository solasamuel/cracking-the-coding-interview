import java.util.Arrays;

public class Exercise6 {

    public static void rotate(int[][] matrix, int n) {

        for (int layer = 0; layer < n/2 ; ++layer) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; ++i) {
                int offset = i - first;

                // temp = top[i]
                int temp = matrix[first][i];

                // top[i] = left[i]
                matrix[first][i] = matrix[last-offset][first];

                // left[i] = bottom[i]
                matrix[last-offset][first] = matrix[last][last-offset];

                // bottom[i] = right[i]
                matrix[last][last-offset] = matrix[i][last];

                // right[i] = temp
                matrix[i][last] = temp;
            }

        }

    }

}
