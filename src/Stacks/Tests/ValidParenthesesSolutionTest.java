package Stacks.Tests;

import Stacks.ValidParenthesesSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class ValidParenthesesSolutionTest {
    public static void testIsValid() {
        ValidParenthesesSolution solution = new ValidParenthesesSolution();

        // Test cases
        String[] testCases = {
                "()",            // true
                "()[]{}",        // true
                "(]",            // false
                "([)]",          // false
                "{[]}",          // true
                "",              // true
                "(((((())))))"   // true
        };

        for (String testCase : testCases) {
            boolean result = solution.isValid(testCase);
            System.out.println("Input: " + testCase + " => Output: " + result);
        }
    }
}
