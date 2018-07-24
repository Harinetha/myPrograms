import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for( int i = 0 ; i < n ; i++ ) {
			for( int j = 0; j < n-i ; j++ ) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
