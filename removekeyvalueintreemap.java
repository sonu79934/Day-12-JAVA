import java.util.*;
public class removekeyvalueintreemap{
    public static void main(String args[]){
        TreeMap<String,String> a=new TreeMap<>();
        a.put("SNO","01");
        a.put("SName","Yasmin");
        a.put("City","Chennai");
        System.out.println(a);
        //removing key value in HashMap
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}   