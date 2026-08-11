import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started");
            System.out.println("Waiting for a client...");

            Socket s = ss.accept();
            System.out.println("Client accepted");

            DataInputStream in =
                new DataInputStream(s.getInputStream());

            String message = "";

            while (!message.equals("Over")) {
                message = in.readUTF();
                System.out.println(message);
            }

            System.out.println("Closing connection");

            in.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}