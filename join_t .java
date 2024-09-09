 public class join_t extends Thread
 {
    public void run()
    {
        for (int i=0;i<=5;i++)
        {
    try
    {
        Thread.sleep(500);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    System.out.println("i="+i);
}
}
public static void main(String args[])
{
    join_t t1=new join_t();
    join_t t2=new join_t();
    join_t t3=new join_t();
    t1.start();
    try{
        t1.join();
    }
    catch( Exception e)
    {
        System.out.println(e);

    }
    t2.start();
    t3.start();
}
}