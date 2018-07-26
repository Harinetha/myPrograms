import java.util.Scanner;
import java.lang.*;
public class SumOfSqOfDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0,k=0;
		double sum = 0;
		int n = s.nextInt();
		int a[] = new int[n];
		while( n > 0 ) {
			a[i++] = n%10;
			n = n/10;
		}
		for(int j = i-1; j >=0 ;j--) {
			double temp = Math.pow(a[j],2);
			sum = sum + temp;
		}
		int p = (int) sum;
		System.out.println(p);
	}
}

