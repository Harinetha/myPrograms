import java.util.Scanner;

public class MaxRepeated {

	public static void main(String[] args) {
		int c=0,temp;
		Scanner s = new Scanner( System.in );
		int n=s.nextInt();
		int arr[] = new int[n];
		for ( int i = 0; i < n; i++ ) 
			arr[i]=s.nextInt();
		int count[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			c=0;
			for( int j = 0; j < n;  j++ ) {
				if(arr[i]==arr[j])
					c++;
			}
			count[i]=c;
		}
		temp=count[0];
		for( int i = 0;i<n;i++) {
			if(count[i]>temp) {
				temp=count[i];
			}
		}
		System.out.println(arr[temp]);
	}

}
