import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(char i = 'a' ; i <= 'z' ; i++) {
			inner:
			for(int j = 0 ; j < str.length() ; j++) {
				if(i == str.charAt(j)) {
					count++;
					break inner;
				}
			}
		}
		if( count == 26)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
