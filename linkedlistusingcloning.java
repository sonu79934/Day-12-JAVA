import java.util.*;
public class linkedlistusingcloning {
    public static void main(String args[]){
        //Accepting values into a LinkedList
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int s=sc.nextInt();
            a.addFirst(s);
        }
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b);
    }
}