import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class Main {
     public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
             int num=s.nextInt();
             al.add(num);
        }
         Collections.rotate(al,k );
        for(int d:al){
            System.out.printf("%d ", d);
        }
         
     }

}
