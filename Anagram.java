import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );
		String str = s.next();
		String ip = "dhoni";
		int flag = 0;
		char[] temp = str.toCharArray();
		char[] temp1 = ip.toCharArray();
		Arrays.sort(temp);
		Arrays.sort(temp1);
		for( int i = 0 ; i < ip.length();i++)
		{
			if(temp[i] != temp1[i])
				flag = 1;
		}
		if(flag == 0 )
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
