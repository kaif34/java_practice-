{
    public class Hierarchical
    public static void main(String args[])
{
    circle c1=new circle();
    triangle t1=new triangle();
    t1.display();
    c1.show();
    t1.disp();
}
}
class shape
{
    void display()
    {
        System.out.println("display different name of shape")
    }
}
class circle extends shape
{
    void show()
    {
        System.out.println("display  different name of shape ")
    }
}
class triangle extends shape
{
    void disp()
    {
        System.out.println(" drawing triangle");
    }

}