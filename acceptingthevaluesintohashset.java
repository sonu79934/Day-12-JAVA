import java.util.*;
public class acceptingthevaluesintohashset{
    public static void main(String args[]){
        HashSet<String> a=new HashSet<>();     
        //accepting the values into hashset
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
    }
}