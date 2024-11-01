package Arrays.Tests;

import Arrays.RomanToIntegerSolution;

import java.util.Scanner;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/1/2024
 */
public class RomanToIntegerSolutionTest {
    public static void testRomanToInt() {
        RomanToIntegerSolution solution = new RomanToIntegerSolution();

        // Test cases
        String[] testCases = {
                "III",      // 3
                "LVIII",    // 58
                "MCMXCIV",  // 1994
                "IX",       // 9
                "XLIV",     // 44
                "CDXLIV",   // 444
                "MMXXIII",   // 2023
                "DCXXI"     // 621
        };

        int[] expectedResults = {
                3, 58, 1994, 9, 44, 444, 2023, 621
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = solution.romanToInt(testCases[i]);
            System.out.println("Input: \"" + testCases[i] + "\" => Output: " + result + ", Expected: " + expectedResults[i]);
            if (result != expectedResults[i]) {
                System.out.println("Test case failed for input: " + testCases[i]);
            }
        }
    }

    public static void testRomanToIntWithUserInput() {
        RomanToIntegerSolution solution = new RomanToIntegerSolution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String userInput = scanner.nextLine();

        int result = solution.romanToInt(userInput);
        System.out.println("The integer value of \"" + userInput + "\" is: " + result);
    }
}
