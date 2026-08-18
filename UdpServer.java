import java.io.*;
import java.net.*;
public class UdpServer{
    public static void main (String [] args) throws IOException{
        DatagramSocket socket = new DatagramSocket(3333);
        System.out.println("Server connected waiting for client");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte [] data = new byte[1024];
        while(true)
        {
            //Receive msg from client
            DatagramPacket packet =new DatagramPacket(data,0,data.length);
            socket.receive(packet);
            String msg = new String(packet.getData(),0, packet.getLength());
            System.out.println("Client:"+msg);
            if(msg.equals("stop"))
                break;
            //Send message to client
            System.out.print("Server:");
            String rply = br.readLine();
            byte [] sendData = rply.getBytes();
            DatagramPacket sendpacket =new DatagramPacket(sendData,sendData.length,packet.getAddress(),packet.getPort());
            socket.send(sendpacket);
            if (rply.equals("stop"))
                break;
        }
        socket.close();
    }

}