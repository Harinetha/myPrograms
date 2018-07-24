import java.util.Scanner;

public class SumEqual {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum1 = 0, sum2 = 0 , flag = 0;
		int n=s.nextInt();
		int a[] = new int[n];
		for( int i=0 ; i<n ;i++) {
			a[i]=s.nextInt();
		}
		for( int i = 0 ; i < n ;i++) {
			for (int j = 0; j < i ; j++) {
				sum1 = sum1 + a[j];
			}
			for (int k = i+1; k < n; k++ ) {
				sum2 = sum2 + a[k];
			}
			if( sum1 == sum2 )
				flag = 1;
		}
		if ( flag == 1)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
