import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		String str = s.nextLine();
		String words[] = str.split("\\s");
		for( int i =0; i< words.length ;i++) {
			System.out.println(new StringBuffer(words[i]).reverse().toString());
			
		}
	}

}
