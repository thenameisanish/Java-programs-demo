import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args)  throws IOException,UnknownHostException{

        
            Socket s = new Socket("127.0.0.1", 5000);
            System.out.println("Connected");

            DataInputStream in = new DataInputStream(System.in);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            String message = "";

            while (!message.equals("Over")) {
                message = in.readLine();
                out.writeUTF(message);
            }

            in.close();
            out.close();
            s.close();

        
        }
    }
