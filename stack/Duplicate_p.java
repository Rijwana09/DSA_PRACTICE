import java.util.Stack;

public class Duplicate_p {

    public static boolean isDup(String str2){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair
                }
            }
            else{
                // opening 
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true duplicate -> y
        String str2 = "(a-b)";  // false duplicate -> no
        System.out.println(isDup(str2));
    }
}
