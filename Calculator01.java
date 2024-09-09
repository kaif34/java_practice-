public class Calculator01 {
    public static void main(String[] args)
    {
        result c1 = new result();
        c1.add();
        c1.multi();
    }
    
}
interface addition
{
    void add();
}
interface multiplication
{
    void multi();
}
class result implements addition,multiplication
{
    public void add()
    {
        int a = 20;
        int b = 2;
        int c = a + b;
        System.out.println("addition is ="+c);
        
    }
    public void multi()
    {
        int x = 90;
        int y = 35;
        int z = x * y;
        System.out.println("multiplication is ="+z);
    }
}