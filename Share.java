import java.util.Scanner;

public class share {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int a[] = new int[n];
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = s.nextInt();
			if(i!=k)
				sum = sum+a[i];
		}
		int annapaid = s.nextInt();
		int cost = sum/2;
		if( cost == annapaid) {
			System.out.println("Bon Appetit");
		}
		else
			System.out.println(annapaid-cost);
	}

}
