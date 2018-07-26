import java.util.Scanner;

public class powerofnext {

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
		if(k ==1) {
			System.out.println(b[0]*b[0]);
			System.exit(0);
		}
		for(i = 0; i < k;i++) {
				if(i == k-1) {
					sum = sum + Math.pow(b[i],b[0]);
					//System.out.println(sum);
				}
				else {
				sum = sum + Math.pow(b[i],b[i+1]);
				}
		}
		 int l= (int) sum;
		System.out.println(l);
	}
}
