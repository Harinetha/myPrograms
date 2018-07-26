import java.util.Scanner;

public class pascalsum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0 , k = 0 ,j , sum = 0;
		int n = s.nextInt();
		int a[] = new int[n]; 
		int b[] = new int[n]; 
		while(n > 0) {
			a[i++] = n%10;
			n=n/10;
		}
		for(j = i-1 ; j >= 0 ;j--) {
			b[k++]=a[j];
		}
		for(i = 0; i <= k;i++) {
			for( j = 0; j<= i;j++) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}

}
