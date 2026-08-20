import java.util.Stack;
public class stackexample {
    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        s.push("I ");
        s.push("love ");
        s.push("you");
        System.out.println("The stack after push operation" +s);
        s.pop();
        s.pop();
        s.pop();
        System.out.println("The stack after pop operation " +s);
    }
}
