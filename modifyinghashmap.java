import java.util.*;
public class modifyinghashmap{
    public static void main(String args[]){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Yasmin");
        System.out.println(a);
        //modifying HashMap key value
        a.put("SNO","226");
        System.out.println(a);
    }
}        