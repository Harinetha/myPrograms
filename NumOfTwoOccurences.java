import java.util.Scanner;

public class NumOfTwoOccurences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = 0 ;
		int a = 0;
		for(int i = 1; i <= n ;i++) {
			int num = i;
			while(num>0) {
				a=num%10;
				if(a==2) {
					c++;
				}
				num=num/10;
			}
		}
		System.out.println(c);
	}

}
