package Arrays.Tests;

import Arrays.ValidAnagramSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/31/2024
 */
public class ValidAnagramSolutionTest {

    public static void testIsAnagramTheFirstWay() {
        ValidAnagramSolution solution = new ValidAnagramSolution();

        // Test cases
        String[][] testCases = {
                {"anagram", "nagaram"}, // true
                {"rat", "car"},         // false
                {"listen", "silent"},   // true
                {"evil", "vile"},       // true
                {"triangle", "integral"}, // true
                {"hello", "world"}      // false
        };

        for (String[] testCase : testCases) {
            boolean result = solution.isAnagramTheFirstWay(testCase[0], testCase[1]);
            System.out.println("Input: \"" + testCase[0] + "\", \"" + testCase[1] + "\" => Output: " + result);
        }
    }

    public static void testIsAnagramTheSecondWay() {
        ValidAnagramSolution solution = new ValidAnagramSolution();

        // Test cases
        String[][] testCases = {
                {"anagram", "nagaram"}, // true
                {"rat", "car"},         // false
                {"listen", "silent"},   // true
                {"evil", "vile"},       // true
                {"triangle", "integral"}, // true
                {"hello", "world"}      // false
        };

        for (String[] testCase : testCases) {
            boolean result = solution.isAnagramTheSecondWay(testCase[0], testCase[1]);
            System.out.println("Input: \"" + testCase[0] + "\", \"" + testCase[1] + "\" => Output: " + result);
        }
    }

    public static void testIsAnagramTheThirdWay() {
        ValidAnagramSolution solution = new ValidAnagramSolution();

        // Test cases
        String[][] testCases = {
                {"anagram", "nagaram"}, // true
                {"rat", "car"},         // false
                {"listen", "silent"},   // true
                {"evil", "vile"},       // true
                {"triangle", "integral"}, // true
                {"hello", "world"}      // false
        };

        for (String[] testCase : testCases) {
            boolean result = solution.isAnagramTheThirdWay(testCase[0], testCase[1]);
            System.out.println("Input: \"" + testCase[0] + "\", \"" + testCase[1] + "\" => Output: " + result);
        }
    }
}
