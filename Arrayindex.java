import java.util.Scanner;

public class Arrayindex {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Enter the size of array:");
            int size = obj.nextInt();

            int[] arry = new int[size];

            System.out.println("Enter " + size + " Elements:");
            for (int i = 0; i < size; i++) {
                arry[i] = obj.nextInt();
            }

            System.out.println("Enter the index of element you want to access:");
            int index = obj.nextInt();

            System.out.println("The element at index " + index + " is " + arry[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        finally {
            obj.close();
        }
    }
}