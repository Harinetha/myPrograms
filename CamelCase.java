import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		int flag = 0;
		Scanner s = new Scanner( System.in );
		String str = s.nextLine();
		
		String words[] = str.split("\\s");
		for( int i = 0 ; i < words.length; i++ ) {
			if( words[i].charAt(0) < 65 || words[i].charAt(0) > 90 )
				flag = 1;
		}
		if( flag == 0 )
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
