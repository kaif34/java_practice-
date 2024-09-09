public class Calculator02 {
    public static void main(String[] args)
    {
        result1 c1 = new result1();
        c1.div();
        c1.sub();
    }
    
}
interface division
{
    void div();
}
interface subtraction
{
    void sub();
}
class result1 implements division,subtraction
{
    public void div()
    {
        int a = 40;
        int b = 2;
        int c = a / b;
        System.out.println("division is ="+c);
        
    }
    public void sub()
    {
        int x = 70;
        int y = 35;
        int z = x - y;
        System.out.println("subtraction is ="+z);
    }
}