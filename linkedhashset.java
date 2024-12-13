import java.util.*;
public class linkedhashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();     
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Yoga");
        a.add("Students");
        System.out.println(a);
        a.remove("Yoga");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}