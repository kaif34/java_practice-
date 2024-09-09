public class super_Keyword
{
    public static void main(String args[])
    {
        mybox b1=new mybox(5,2,3);
        b1.area1();
        b1.volume();

    }

}
class box
{
    int l,w,area;
    box(int length,int width)
    {
        l=length;
        w=width;

    }
    void area1()
    {
        area=l*w;
        System.out.println("area="+area);
    }
}
class mybox extends box
{
    int d,v;
    mybox(int length,int width,int depth)
    {
        super(length,width);
        d=depth;

    }
    void volume()
    {
        v=l*w*d;
        System.out.println("volume="+v);
    }
}