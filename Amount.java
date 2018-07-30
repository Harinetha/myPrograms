import java.util.Scanner;

public class Amount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		
		if(n > 1000) 
			sum = sum + n / 1000;
		n = n % 1000;
		if(n < 500)
			sum = sum + n / 100;
		else
			sum = sum + (n / 100) % 5 + 1;
		n = n % 100;
	
		if(n < 50)
			sum = sum + n / 10;
		else
			sum = sum + (n / 10) % 5 + 1;
		n = n % 10;
		
		sum = sum + n;
		System.out.println(sum);
	}

}
