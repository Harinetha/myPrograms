import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		int n = s.nextInt();
		int a[] = new int[n+2];
		int c[] = new int[n];
		c[0]=1;
		int k = 1;
		int sum = 0;
		for(int i = 0 ; i < n ;i++){
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i < n ;i++){
			c[i] = 1;
		}
		for(int i = 0; i < n ;i++){
			if(i == 0){
				if(a[i] > a[i+1]){
					c[i] = c[i-1]+1;
				}
			}
			else if(i == n-1){
				if(a[i] > a[i-1]){
					c[i] = c[i-1]+1;
				}
			}
			else if( a[i]  > a[i-1] ||a[i] > a[i+1]){
				c[i] = c[i-1]+1;
			}
		}
		for (int i = 0 ; i < n ; i++){
			sum = sum + c[i];
		}
		System.out.println(sum);
	}

}
