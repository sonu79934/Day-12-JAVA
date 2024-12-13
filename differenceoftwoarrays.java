import java.util.*;
public class differenceoftwoarrays{
    public static void main(String aegs[]){
        int arr1[]={23,46,77,57,67};
        int arr2[]={36,67,45,56,54,35};
        Set<Integer>a=new HashSet<>();
        Set<Integer>b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer> u=new HashSet<>(a);
        u.removeAll(b);
        System.out.println(u);
    }
}