import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    ArrayList<Integer>v=new ArrayList<Integer>();
    ArrayList<Integer>u=new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        int c=s.nextInt();
        v.add(c);
        u.add(c);
    }
    Collections.sort(v);
    if(u==v)
        System.out.println("yes");
    else
        System.out.println("no");
}
}
