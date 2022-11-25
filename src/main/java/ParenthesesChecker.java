import java.util.Stack;

public class ParenthesesChecker {

    private Stack<Character> parenthesesStackOpenBrackets;
    private Stack<Character> parenthesesStackClosedBrackets;
    private Stack<Character> parenthesesStack;


    public ParenthesesChecker()  {
        this.parenthesesStackOpenBrackets = new Stack<>();
        this.parenthesesStackClosedBrackets = new Stack<>();
        this.parenthesesStack = new Stack<>();
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

      //second attempt

//    public boolean checkParentheses(String testString){
//
////        int lengthOfString = testString.length();
////
////        System.out.println(lengthOfString);
//
//        for(int i = 0; i< testString.length(); i++) {
//
//            char letter = testString.charAt(i);
//
//            if( letter == '(' || letter == '{' || letter == '[' || letter == '<')
//                parenthesesStack.push(letter);
//
//            else if (letter == ')' || letter == '}' || letter == ']' || letter == '>') {
//                if(parenthesesStack.empty()){
//                    return false;
//                } else {
//                    parenthesesStack.pop();
//                }
//
//            }
//
//        }
//
//        return true;
//    }



}

