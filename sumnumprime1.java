import java.util.Scanner;

public class sumof2primes {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );
		int flag1 = 0, flag2 = 0, c = 0;
		int n = s.nextInt();
		for ( int i = 1 ,j = n-1; i <= n/2 & j>=n/2; i++,j-- ) {
			flag1 = 0;
			flag2 = 0;
			for(int k = 2 ; k < i ; k++) {
				if(i%k == 0) {
					flag1 = 1;
					break;
				}
			}
			
			for(int l = 2; l <  j ; l++) {
				if(j%l == 0) {
					flag2 = 1;
					break;
				}
			}
			if( flag1 == 0 && flag2 == 0 && i!=1 && j!=1 ){
				c++;
			}
		}
		System.out.println(c);

	}

}
