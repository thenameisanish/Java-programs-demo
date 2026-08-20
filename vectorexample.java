import java.util.Vector;
public class vectorexample{
    public static void main(String[] args)
    {
        Vector <String>  v = new Vector<String>();
        v.add("Purbanchal");
        v.add("university");
        v.add("is");
        v.add("the");
        v.add("best");
        System.out.println("Vector before iteam is removed:"+v);
        v.remove(4);
        System.out.println("Vector after removing item" +v);
    }
}