import java.util.*;
class collection_linklist{
    public static void main(String args[]){
        LinkedList<String> a1=new LinkedList<String>();
    
    a1.add("Ravi");
    a1.add("Vijay");
    a1.add("Ravi");
    a1.add("Ajay");

    Iterator<String> itr=a1.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }


}
}