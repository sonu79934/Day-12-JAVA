import java.util.*;
public class treemapcontainskey{
    public static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={77,8,9,5,6,77,8,9,9,8};
        TreeMap<Integer,Integer> a=new TreeMap<>();
        for(int a1:arr)
        {
            if(a.containsKey(a1))
            {
                a.put(a1,a.get(a1)+1);
            }else{
                a.put(a1,1);
            }
        }
        System.out.println(a);
    }
}        