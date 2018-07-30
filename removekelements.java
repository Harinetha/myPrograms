import java.util.Scanner;

public class removekelements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int n,k;
		n = s.nextInt();
		k = s.nextInt();
		for(int i = 0 ; i < n ; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			if(a[i]==k) {
				for(int j = i; j < n ;j++) {
					a[j] = a[j+1];
				}
				n--;
			}
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.println(a[i]);
		}
	}

}
