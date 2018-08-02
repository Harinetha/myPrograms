import java.util.Scanner;

public class EqualAverage {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0 ;i < n ; i++){
			a[i] = s.nextInt();
		}
    
		for(int i = 0 ; i < n ; i++){
			int c = 0;
			int sum = 0;
			int c1 = 0;
			int sum1 = 0;
			for(int j = 0; j <= i ; j++){
				c++;
				sum = sum + a[j];
			}
			sum = sum / c ;
			for(int j = i+1; j < n ; j++){
				c1++;
				sum1 = sum1 + a[j];
			}
			if(i!=n-1){
			sum1 = sum1 / c1;
			}
			if(sum == sum1){
				System.out.println("yes");
				System.exit(0);
			}
		}
		System.out.println("no");
		
	}

}
