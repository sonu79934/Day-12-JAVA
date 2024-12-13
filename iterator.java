import java.util.*;
public class iterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();     
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Yoga");
        a.add("Students");
        //Iterator
        for(String s:a)
        {
           System.out.print(s+" ");  
        }
    }
}