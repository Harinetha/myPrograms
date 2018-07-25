import java.util.Scanner;
public class chartoASCII {
	
	public static void main(String[] args) {
		int sum =0;
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i = 0; i < str.length() ; i++) {
			char a=str.charAt(i);
			sum = sum +  a;
		}
		System.out.println(sum);
	}

}
