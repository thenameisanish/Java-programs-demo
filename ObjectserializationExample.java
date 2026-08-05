import java.io.*;
import java .util.Scanner;
class student implements  Serializable{
    int id;
    String name;
    student(int id ,String name){
        this.id=id;
        this.name=name;
    }
}

public class ObjectserializationExample{
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        //writing
         Scanner obj = new Scanner(System.in);
    System.out.println("Enter id: ");
     int id =obj.nextInt();
    obj.nextLine();
    System.out.println("Enter name:");
    String name =obj.nextLine();
    student s1 = new student( id,name);
    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Demo.obj"));
    oos.writeObject(s1);
    oos.close();
    
    //Reading
    ObjectInputStream ois =new ObjectInputStream(new FileInputStream("Demo.obj"));
    student st = (student) ois.readObject();
    ois.close();

    System.out.print("Id="+st.id +"Name ="+st.name);
    obj.close();
    
    
    

}
}
