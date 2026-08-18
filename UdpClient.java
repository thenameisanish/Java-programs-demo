import java.io.*;
import java.net.*;
public class UdpClient {
    public static void main (String[] args) throws IOException {
        DatagramSocket socket =new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InetAddress address = InetAddress.getByName("localhost");
        while(true)
        {
            System.out.print("Client: ");
            String msg = br.readLine();
            byte [] data = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(data,data.length,address,3333);
            socket.send(packet);
            if (msg.equals("stop"))
                break;
                
    byte [] receiveData = new byte[1024];
    DatagramPacket receivepacket =new DatagramPacket(receiveData, 0,receiveData.length);
    socket.receive(receivepacket);
    String rply = new String  (receivepacket.getData(),0,receivepacket.getLength());
    System.out.println("Server:"+rply);
    if(rply.equals("stop"))
        break;

            }
            socket.close();
        }
    }
