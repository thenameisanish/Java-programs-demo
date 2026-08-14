
import java.rmi.registry.*;
import java.util.Scanner;

public class Client1 {

    public static void main(String[] args) {

        try {
            Registry rgsty = LocateRegistry.getRegistry(5000);

            Calc obj = (Calc) rgsty.lookup("Multiply");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first no:");
            int a = sc.nextInt();

            System.out.println("Enter second no:");
            int b = sc.nextInt();

            int value = obj.multiply(a, b);

            System.out.println("Multiplication is " + value);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}