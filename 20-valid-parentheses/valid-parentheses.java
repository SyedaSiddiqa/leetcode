  import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            // open brackets
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                // agar stack empty hai
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // stack empty hona chahiye
        return stack.isEmpty();
    }
}
    