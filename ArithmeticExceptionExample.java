import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int a = obj.nextInt();

            System.out.println("Enter another number:");
            int b = obj.nextInt();

            int c = a / b;

            System.out.println("The result is: " + c);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            obj.close();
        }
    }
}