package stack;

public class Validator {

    public boolean validateBrackets(String expression) {
        Nodestack stack = new Nodestack();
        for (int i = 0; i < expression.length(); i++) {
            char charTemp = expression.charAt(i);
            if (charTemp == '(' || charTemp == '[' || charTemp == '{') {
                stack.push(charTemp);
            } else if (charTemp == ')' || charTemp == ']' || charTemp == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = (char)stack.pop();
                if (!(pop == '(' && charTemp == ')' || pop == '[' && charTemp == ']' || pop == '{' && charTemp == '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
