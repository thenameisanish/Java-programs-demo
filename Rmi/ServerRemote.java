
import java.rmi.registry.*;

public class ServerRemote {

    public static void main(String[] args) throws Exception {

        CalcRemote obj = new CalcRemote();

        Registry rgsty = LocateRegistry.createRegistry(5000);

        rgsty.rebind("Multiply", obj);

        System.out.println("Server Ready");
    }
}