import java.io.*;
public class Bufferedstreamclass {
    public static void main (String[] args) throws IOException{
        // writing to file
     BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("student.txt"));
     String msg ="Hello this buffered stream class example where we do both read and write example";
     bos.write(msg.getBytes());
     bos.close();
     // Reading file 
     BufferedInputStream bis = new BufferedInputStream(new FileInputStream("student.txt"));
     int ch;
     while ((ch = bis.read()) !=-1) {
        System.out.print((char)ch);
        
     }
     bis.close();

    }
    
}
