import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int c;
	    Scanner s=new Scanner(System.in);
	    ArrayList<Integer> al=new ArrayList<Integer>();
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        c=s.nextInt();
	        al.add(c);
	    }
		Collections.sort(al);
	    for(int i=0;i<n-1;i++){
	        if(al.get(i)==al.get(i+1))
	             i++;
	        else
	            System.out.print(al.get(i)+" ");
	        if(i==n-2 &&(al.get(i+1)!=al.get(i)))
	            System.out.print(al.get(i+1));
	    }
	     
	}
}
