import java.util.*;
public class modifyingtreemap{
    public static void main(String args[]){
        TreeMap<String,String> a=new TreeMap<>();
        a.put("SNO","01");
        a.put("SName","Yasmin");
        System.out.println(a);
        //modifying HashMap key value
        a.put("SNO","226");
        System.out.println(a);
    }
}        