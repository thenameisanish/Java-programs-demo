import java.io.*;
public class Datastreamclass {
    public static void main(String[] args) throws IOException{
        //writing to file
        DataOutputStream dos =new DataOutputStream(new FileOutputStream("employee.txt"));
        dos.writeInt(101);
        dos.writeUTF("Ram");
        dos.writeDouble(39000.1990);
        dos.close();
// Reading
DataInputStream dis = new DataInputStream(new FileInputStream("employee.txt"));
int id = dis.readInt();
 String name = dis .readUTF();
 double sal = dis.readDouble();
 System.out.println("Id="+id);
 System.out.println("Name="+name);
 System.out.println("Salary="+sal);
 dis.close();
    }
    
}
