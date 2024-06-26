public class SpiralPatter {
    public static void main(String[] args) {
        int n = 5; // Size of the matrix
        int[][] matrix = new int[n][n];
        fillSpiral(matrix, n);
        printMatrix(matrix, n);
    }

    private static void fillSpiral(int[][] matrix, int n) {
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right && value <= n * n; i++) {
                matrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom && value <= n * n; i++) {
                matrix[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left && value <= n * n; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top && value <= n * n; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
    }

    private static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}