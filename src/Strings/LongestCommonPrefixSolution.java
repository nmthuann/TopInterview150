package Strings;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/3/2024
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return ""; // Nếu mảng trống, trả về chuỗi rỗng
        }
        String prefix =  strs[0];
        for(int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return  "";
            }
        }
        return prefix;
    }
}
