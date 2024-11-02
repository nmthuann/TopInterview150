package Strings.Tests;

import Strings.LengthOfLastWordSolution;

import java.util.Scanner;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/2/2024
 */
public class LengthOfLastWordSolutionTest {
    public static void testLengthOfLastWord() {
        LengthOfLastWordSolution solution = new LengthOfLastWordSolution();

        // Test cases
        String[] testCases = {
                "Hello World",           // 5
                "   fly me   to   the moon  ", // 4
                "luffy is still joyboy",  // 6
                "singleWord",             // 10
                "trailing spaces   ",     // 6
                "   leading spaces",      // 6
                "   ",                    // 0
                ""                        // 0
        };

        int[] expectedResults = {
                5, 4, 6, 10, 6, 6, 0, 0
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = solution.lengthOfLastWord(testCases[i]);
            System.out.println("Input: \"" + testCases[i] + "\" => Output: " + result + ", Expected: " + expectedResults[i]);
            if (result != expectedResults[i]) {
                System.out.println("Test case failed for input: \"" + testCases[i] + "\"");
            }
        }
    }


    public static void testUserInput() {
        LengthOfLastWordSolution solution = new LengthOfLastWordSolution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to find the length of the last word:");
        String input = scanner.nextLine();

        int result = solution.lengthOfLastWord(input);
        System.out.println("Input: \"" + input + "\" => Output: " + result);

        scanner.close();
    }
}
