import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        a.push("viii");
        a.push("sabru");
        a.push("ismail");
        while (! a.isEmpty()){
        System.out.println(a.pop());
        }
    }
}
