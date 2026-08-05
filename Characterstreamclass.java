import java.io.*;
public class Characterstreamclass {
    public static void main(String[] args) throws IOException {
        // write
        FileWriter fw= new FileWriter("abc.txt");
        fw.write("Hello this the example of characterstream class where we do example of read and write");
        fw.close();
        // Reading
        FileReader fr = new FileReader("abc.txt");
        int  ch;
        while((ch=fr.read())!=-1)
        {
     System.out.print((char)ch);
        }
        fr.close();
    }
}
