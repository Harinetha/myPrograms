import java.util.Scanner;

public class ReverseWORepition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		String reverse = "";
		String newstr[];
		String str = s.next();
		int l = str.length();
		for(int i = l -1; i >= 0 ; i-- ) {
			reverse = reverse + str.charAt(i);
		}
		for(int i = 0 ; i < reverse.length() ;i++) {
			count = 0;
			for(int j = 0 ; j < reverse.length() ;j++) {
				if(reverse.charAt(i)==reverse.charAt(j)) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(reverse.charAt(i));
			}
		}
	}

}
