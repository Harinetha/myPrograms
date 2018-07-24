import java.util.Scanner;

public class AlternateSorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp,c1=0,c2=n-1;
		int a[]=new int[n];
		int b[]=new int[n];
		for( int i = 0; i < n; i++) {
			a[i]=s.nextInt();
		}
		for( int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for( int i = 0; i < n; i++) {
			if(i%2==0) {
			System.out.println(a[c1]);
			c1=c1+1;
			}
			else {
				System.out.println(a[c2]);
				c2=c2-1;
			}
		}

	}

}
