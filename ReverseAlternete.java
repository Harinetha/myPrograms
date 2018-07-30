import java.util.Scanner;

public class reverseWordAlternate {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		String str = s.nextLine();
		String words[] = str.split("\\s");
		for( int i =0; i< words.length ;i++) {
			if(i%2 == 0)
				System.out.println(new StringBuffer(words[i]).reverse().toString());
			else
				System.out.println(new StringBuffer(words[i]));
		}
	}

}
