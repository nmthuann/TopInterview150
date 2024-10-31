package Arrays;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/31/2024
 * Desc: Given an integer x, return true if x is a palindrome, and false otherwise.
 * A palindrome is a number that remains the same when its digits are reversed.
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 * Therefore, it is not a palindrome.
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 * Constraints:
 * -231 <= x <= 231 - 1
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumberSolution {
    public boolean isPalindromeTheFirstWay(int x) {
        if(x < 0) return false;
        String str = String.valueOf(x);
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1)) return false;
        }
        return true;
    }

    public boolean isPalindromeTheSecondWay(int x) {
            int temp = x;
            int y = 0;
            if(x < 0 || x % 10 == 0 && x != 0)return false;
            while(x > 0) {
                int rem = x % 10; // rem: số dư
                y = y * 10 + rem;
                x = x / 10; // số lần lặp
            }
            if (temp == y) return true;
            return false;
    }
}
