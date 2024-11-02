package Strings;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/2/2024
 */
public class LengthOfLastWordSolution {
    public int lengthOfLastWord(String s) {
        System.out.println(s.length());
        int end = s.length();

        while (end > 0 && s.charAt(end - 1) == ' ') {
            end--;
        }

        int start = end;
        while (start > 0 && s.charAt(start-1) != ' ') {
            start--;
        }
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        return end - start;
    }


    public int lengthOfLastWordOptimize(String s) {
        int lastWordEndIndex = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lastWordEndIndex = i;
                break;
            }
        }

        int lastWordStartIndex = 0;

        for (int i = lastWordEndIndex - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                lastWordStartIndex = i + 1;
                break;
            }
        }

        return lastWordEndIndex - lastWordStartIndex + 1;
    }
}
