package crio101;

import java.util.Stack;

public class PostFixExpression {
    public static void main(String[] args) {
        String postFix = "2 3 +";
        int val = evaluatePostfix(postFix);
        System.out.println("Printing Answer :" +val);
    }

    public static int evaluatePostfix(String postfix) {
        String[] str = postfix.split(" ");
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i< str.length;i++){
            if(str[i].equals("+") ){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if(str[i].equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if(str[i].equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if(str[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }else{
                stack.push(Integer.parseInt(str[i]));
            }
        }
        return stack.peek();
    }
}
