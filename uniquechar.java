import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		int c=0;
		Scanner s = new Scanner( System.in );
		String str =  s.next();
		for ( int i = 0; i < str.length(); i++ ) {
			c=0;
			for( int j = 0; j < str.length(); j++ ) {
				if( str.charAt(i)==str.charAt(j) ) {
					c++;
				}
			}
			if( c == 1 )
				System.out.println(str.charAt(i));
		}
	}

}
