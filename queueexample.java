import java.util.Queue;
import java.util.LinkedList;

public class queueexample {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        q.add(" Ronalod");
        q.add("Messi");

        System.out.println("The queue after adding: " + q);

        q.remove();

        System.out.println("The status of queue after removing: " + q);
    }
}