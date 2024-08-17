package SlidingWindows;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/31/2024
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int leftPointer = 0;
        int maxLength = 0;
        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char currentChar = s.charAt(rightPointer);
            while (set.contains(currentChar)){
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(currentChar);
            maxLength =  Math.max(maxLength, rightPointer - leftPointer + 1);
        }
        return maxLength;
    }
}
