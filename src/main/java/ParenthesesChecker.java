import java.util.Stack;

public class ParenthesesChecker {

    private Stack<Character> parenthesesStackOpenBrackets;
    private Stack<Character> parenthesesStackClosedBrackets;


    public ParenthesesChecker()  {
        this.parenthesesStackOpenBrackets = new Stack<>();
        this.parenthesesStackClosedBrackets = new Stack<>();

    }

    public boolean checkParentheses(String testString) {


        for(int i = 0; i< testString.length(); i++){

            char letter = testString.charAt(i);
            if(letter == '(') {
                parenthesesStackOpenBrackets.push(letter);
            }
            if (letter == ')') {
                parenthesesStackClosedBrackets.push(letter);
            }

        }



        if (parenthesesStackOpenBrackets.size() == parenthesesStackClosedBrackets.size()) {
            return true;
        } else {
            return false;
        }


    }


}

