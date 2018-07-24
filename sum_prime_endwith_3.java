import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		int flag, sum = 0;
		Scanner s = new Scanner( System.in );
		int n = s.nextInt();
		for(int i = 2; i < n; i++) {
			if( i % 10 == 3) {
				flag = 0;
				for( int j = 2; j < i/2; j++) {
					if( i % j == 0)
					flag = 1;
				}
				if(flag == 0) 
					sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
