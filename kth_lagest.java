import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String aa[]){
       
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    ArrayList<Integer>ar=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        int c=s.nextInt();
        ar.add(c);
    }
   ArrayList<Integer>v=new ArrayList<Integer>(ar);
   Collections.sort(v);
   System.out.println(v.get(k-1));
}
}
