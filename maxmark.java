import java.util.Scanner;

public class MaxMark {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum1 = 0 , sum2 = 0;
		String str1 = s.next();
		String str2 = s.next();
		String temp;
		String person1[] = str1.split("#",4);
		String person2[] = str2.split("#",4);
		for(int i = 1 ; i < person1.length ; i++) {
			temp = person1[i];
		    sum1 = sum1 + Integer.parseInt(temp);
		}
		for(int i = 1 ; i < person2.length ; i++) {
			temp = person2[i];
		    sum2 = sum2 + Integer.parseInt(temp);
		}
		if(sum1 > sum2)
			System.out.println(person1[0]);
		else
			System.out.println(person2[0]);
	}
}
