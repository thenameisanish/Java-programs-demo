import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str, str2;
        while (true) {
            str = din.readUTF();
            System.out.println("Client says: " + str);

            if (str.equals("stop")) {
                System.out.println("Client disconnected");
                break;
            }

            str2 = br.readLine();
            dout.writeUTF(str2);

            if (str2.equals("stop")) {
                System.out.println("Server disconnected");
                break;
            }
        }
        din.close();
        dout.close();
        s.close();
        ss.close();
    }
}