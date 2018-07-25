import java.util.Scanner;

public class sample {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = 0;
		int a[] = new int[n];
		for(int i = 0;i < n; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i <  n - 1 ; i++) {
			if(a[i]<a[i+1])
				c++;
		}
		System.out.println(c);
	}

}
