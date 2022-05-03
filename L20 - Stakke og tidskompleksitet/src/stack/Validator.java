package stack;

public class Validator {

    public boolean validateBrackets(String expression) {
        ArrayListStack stack = new ArrayListStack();
        for (int i = 0; i < expression.length(); i++) {
            char charTemp = expression.charAt(i);
            if (charTemp == '(' || charTemp == '[' || charTemp == '{') {
                stack.push(charTemp);
            } else if (charTemp == ')' || charTemp == ']' || charTemp == '}') {

            }
        }
        return stack.isEmpty();
    }
}
