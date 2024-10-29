package SlidingWindows.Tests;

import SlidingWindows.LongestSubstringWithoutRepeatingCharactersSolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class LongestSubstringWithoutRepeatingCharactersSolutionTest {

    public static void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharactersSolution solution =
                new LongestSubstringWithoutRepeatingCharactersSolution();

        // Test cases
        String[] testCases = {
                "abcabcbb",        // 3 ("abc")
                "bbbbb",           // 1 ("b")
                "pwwkew",          // 3 ("wke")
                "",                // 0
                "au",              // 2 ("au")
                "dvdf"             // 3 ("vdf")
        };

        for (String testCase : testCases) {
            int result = solution.lengthOfLongestSubstring(testCase);
            System.out.println("Input: \"" + testCase + "\" => Output: " + result);
        }
    }
}
