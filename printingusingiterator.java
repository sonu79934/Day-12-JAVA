import java.util.*;
public class printingusingiterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();     
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Yoga");
        a.add("Students");
        //Printing using Iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
           System.out.print(itr.next()+" ");  
        }
    }
}