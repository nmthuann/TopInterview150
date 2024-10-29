package Matrix.Tests;

import Matrix.SetMatrixZeroesSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class SetMatrixZeroesSolutionTest {
    public static void testSetZeroes() {
        SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();

        // Test cases
        int[][][] testCases = {
                {
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1}
                },
                {
                        {0, 1, 2, 0},
                        {3, 4, 5, 2},
                        {1, 3, 1, 5}
                },
                {
                        {1}
                },
                {
                        {0}
                },
                {
                        {1, 2, 3},
                        {4, 0, 6},
                        {7, 8, 9}
                }
        };

        for (int[][] matrix : testCases) {
            System.out.println("Original matrix:");
            printMatrix(matrix);
            solution.setZeroes(matrix);
            System.out.println("Matrix after setZeroes:");
            printMatrix(matrix);
            System.out.println();
        }
    }

    // Helper method to print matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
