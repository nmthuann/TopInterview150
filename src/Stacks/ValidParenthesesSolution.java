package Stacks;

import java.util.Stack;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 8/2/2024
 */
public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // open
            if  (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // close
            else {
                if(stack.isEmpty()) {return false;}
                Character top = stack.pop();
                if(
                        top != '(' && ch == ')' ||
                                top != '[' && ch == ']' ||
                                top != '{' && ch == '}'
                ){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
