public class Encapsulation
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.setRollno(101);
        s1.setName("Tejasvi");
        System.out.println("rollno="+s1.getRollno());
        System.out.println("name="+s1.getName());

    }
}
class student
{
  private int rollno;
  private String name;

  void setRollno(int newRoll)
  {
    rollno=newRoll;
  }
  int getRollno()
  {
    return rollno;
  }
  void setName(String sname)
  {
    name=sname;
  }
  String getName()
  {
    return name;
  }

}