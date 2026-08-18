class thread1 implements Runnable {
    public void run()
    {
        while(true)
        {
            System.out.println("Visa");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
            e.printStackTrace();
        }
    }

}
}
class thread2 implements Runnable 
{
    public void run()
    {
        while(true)
        {
            System.out.println("Paglu");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class thread {
    public static void main(String [] args)
    {
        thread1 t1 =new thread1();
        Thread th1 =new Thread(t1);
        th1.start();
        thread2 t2 =new thread2();
        Thread th2 = new Thread(t2);
        th2.start();;
    }
    
}
