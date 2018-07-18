import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n+1];
	    for(int i=1;i<=n;i++){
	        a[i]=s.nextInt();
	    }
	    for(int i=1;i<=n;i++){
	        if((i%2==0 && a[i]%2==0)||(i%2!=0 && a[i]%2!=0))
		        System.out.print(a[i]+" ");
	    }
	}
}
