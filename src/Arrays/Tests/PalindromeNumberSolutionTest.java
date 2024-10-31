package Arrays.Tests;

import Arrays.PalindromeNumberSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/31/2024
 */
public class PalindromeNumberSolutionTest {
    public static void testIsPalindromeTheFirstWay() {
        PalindromeNumberSolution solution = new PalindromeNumberSolution();

        // Test cases
        int[] testCases = {121, -121, 10, 0, 12321};
        boolean[] expectedResults = {true, false, false, true, true};

        for (int i = 0; i < testCases.length; i++) {
            boolean result = solution.isPalindromeTheFirstWay(testCases[i]);
            System.out.println("Input: " + testCases[i] + " => Output: " + result + ", Expected: " + expectedResults[i]);
        }
    }

    public static void testIsPalindromeTheSecondWay() {
        PalindromeNumberSolution solution = new PalindromeNumberSolution();

        // Test cases
        int[] testCases = {121, -121, 10, 0, 12321};
        boolean[] expectedResults = {true, false, false, true, true};

        for (int i = 0; i < testCases.length; i++) {
            boolean result = solution.isPalindromeTheSecondWay(testCases[i]);
            System.out.println("Input: " + testCases[i] + " => Output: " + result + ", Expected: " + expectedResults[i]);
        }
    }
}
