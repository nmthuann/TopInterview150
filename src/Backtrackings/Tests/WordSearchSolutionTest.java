package Backtrackings.Tests;

import Backtrackings.WordSearchSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class WordSearchSolutionTest {
    public static void testExist() {
        WordSearchSolution solution = new WordSearchSolution();

        // Test cases
        char[][][] boards = {
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                },
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                },
                {
                        {'A'}
                },
                {
                        {'A', 'B'},
                        {'C', 'D'}
                },
                {
                        {'A', 'B', 'C'},
                        {'D', 'E', 'F'},
                        {'G', 'H', 'I'}
                }
        };

        String[] words = {
                "ABCCED",  // True
                "SEE",     // True
                "ABCB",    // False
                "A",       // True
                "GHI",     // True
                "XYZ"      // False
        };

        for (int k = 0; k < boards.length; k++) {
            char[][] board = boards[k];
            String word = words[k];
            boolean result = solution.exist(board, word);
            System.out.println("Board:");
            printMatrix(board);
            System.out.println("Word: " + word + " | Exists: " + result);
            System.out.println();
        }
    }

    // Helper method to print board
    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
