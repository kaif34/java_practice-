public class Interface1
{
    public static void main(String args[])
    {
        details d1=new details();
        d1.sinfo();
        d1.emp();

    }
}
interface sdetail
{
     void sinfo();
    
    
}
interface edetail
{
    void emp();
}
class details implements sdetail,edetail
{
    public void sinfo()
    {
        int rno=101;
        String sname="Tejasvi";
    
        System.out.println("rollno="+rno);
        System.out.println("name="+sname);
    }
    public void emp()
    {
        int eid=1001;
        String desig="manager";
        System.out.println("eid="+eid);
        System.out.println("designation="+desig);

    }

}