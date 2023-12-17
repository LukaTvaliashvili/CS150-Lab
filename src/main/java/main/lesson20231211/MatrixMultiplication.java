package main.lesson20231211;

public class MatrixMultiplication {

    public static void main(String[] args) {

        traverse2dArray(new int[][]{{1, 2, 3}, {4, 5, 6}});
        int[][] resultMatrix = multiplyMatrices(new int[][]{{1, 2, 3}, {4, 5, 6}},
                new int[][]{{7, 8}, {9, 10}, {11, 12}});
        traverse2dArray(resultMatrix);
    }

    private static void traverse2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void traverse2dArray1(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }


    // A[0][0] * B[0][0] + A[0][1] * B[1][0] + A[0][2] * B[2][0] (a)
    // A[0][0] * B[0][1] + A[0][1] * B[1][1] + A[0][2] * B[2][1] (b)
    /*
      [{a, b}
       {c  d}]
     */
    private static int[][] multiplyMatricesHardCoded(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Try entering matrices with proper dimensions");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
}
