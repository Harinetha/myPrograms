import java.util.Scanner;

public class PrimenumlessthanN {

	public static void main(String[] args) {
		int flag = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 2 ; i < n ; i++ ) {
			flag = 0;
			for(int j = 2 ; j < i; j++) {
				if(i%j == 0) {
					flag=1;
					break;
				}
			}
			//System.out.println(flag);
			if(flag == 0)
				System.out.print(i+" ");
		}

	}

}
