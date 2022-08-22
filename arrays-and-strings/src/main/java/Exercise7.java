public class Exercise7 {

    public static void setZeros(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        // two-scan approach
        // first scan to find zeros
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;

                }
            }
        }

        // second scan to set zeros
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
