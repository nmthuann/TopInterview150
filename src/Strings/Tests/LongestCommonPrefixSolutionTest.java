package Strings.Tests;

import Strings.LongestCommonPrefixSolution;

import java.util.Scanner;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/3/2024
 */
public class LongestCommonPrefixSolutionTest {
    public static void testLongestCommonPrefix() {
        LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

        // Test cases
        String[][] testCases = {
                {"flower", "flow", "flight"},        // Expected: "fl"
                {"dog", "racecar", "car"},           // Expected: ""
                {"interspecies", "interstellar", "interstate"}, // Expected: "inters"
                {"throne", "throne"},                // Expected: "throne"
                {"apple", "ape", "april"},           // Expected: "ap"
                {"singleWord"},                      // Expected: "singleWord"
                {"", "empty", "entries"},            // Expected: ""
                {"prefix", "pretext", "prevent"},    // Expected: "pre"
                {"a"},                               // Expected: "a"
                {"aa", "ab"}                         // Expected: "a"
        };

        String[] expectedResults = {
                "fl", "", "inters", "throne", "ap", "singleWord", "", "pre", "a", "a"
        };

        for (int i = 0; i < testCases.length; i++) {
            String result = solution.longestCommonPrefix(testCases[i]);
            System.out.println("Input: " + String.join(", ", testCases[i]) +
                    " => Output: \"" + result + "\", Expected: \"" + expectedResults[i] + "\"");
            if (!result.equals(expectedResults[i])) {
                System.out.println("Test case failed for input: " + String.join(", ", testCases[i]));
            }
        }
    }
    public static void testUserInput() {
        LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings in the array:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] userInputs = new String[n];

        System.out.println("Enter each string:");
        for (int i = 0; i < n; i++) {
            userInputs[i] = scanner.nextLine();
        }

        String result = solution.longestCommonPrefix(userInputs);
        System.out.println("Input: " + String.join(", ", userInputs) + " => Output: \"" + result + "\"");

        scanner.close();
    }

}
