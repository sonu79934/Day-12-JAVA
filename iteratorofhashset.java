import java.util.*;
public class iteratorofhashset{
    public static void main(String args[]){
        HashSet<String> a=new HashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        //iterator
        for(String s:a)
        {
            System.out.print(s+" ");
        }
    }
}