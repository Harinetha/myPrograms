import java.util.Scanner;

public class AlternateCaps {

	public static void main(String[] args) {
		int b = 0;
		Scanner s =  new Scanner(System.in);
		String str = s.nextLine();
		StringBuffer buffer = new StringBuffer(str);
		for(int i = 0; i < str.length() ; i++) { 
			if(buffer.charAt(i)==' ') {
				b=0;
			}
			if(b % 2 == 0) {
				System.out.print(Character.toUpperCase(buffer.charAt(i)));
				b++;
			}
			else {
				System.out.print(buffer.charAt(i));
				b++;
			}
		}
	}
}

