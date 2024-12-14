import java.util.*;
public class printingtreemapkeyvalue{
    public static void main(String args[]){
        TreeMap<String,String> a=new TreeMap<>();
        a.put("SNO","01");
        a.put("SName","Yasmin");
        System.out.println(a);
        //printing HashMap key value
        if(a.containsKey("SName"))
        {
            String d=a.get("SName");
            System.out.println(d);
        }
    }
}      