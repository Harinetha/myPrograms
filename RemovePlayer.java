import java.util.Scanner;

public class RemovePlayer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int flag = 0;
		for(double i = 0 ; flag == 0; i++) {
			if(Math.pow(2, i) == n ) {
				flag++;
				System.out.println("0");
			}
			if(Math.pow(2, i) > n ) {
				flag++;
				System.out.println((int)(n-Math.pow(2, i-1)));
			}
		}
	}

}
