import java.util.Scanner;

public class numofpower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0 , k = 0 ,j;
		double sum = 0;
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
		for(i = 0; i < k;i++) {
				sum = sum + Math.pow(a[i],k);
		}
		 int l= (int) sum;
		System.out.println(l);
	}

}
