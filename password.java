import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c1 = 0,c2 =0,c=0;
		String s1 = s.next();
		String s2 = s.next();
		int l1 = s1.length();
		int l2 = s2.length();
		int t1 =0,t2 =0;
		int max = l1>l2 ? l1:l2;
		for(int i = 0; i< max*2 ; i++) {
			if(i%2 == 0) {
				if(c1==l1) {
					System.out.print(t1);
					t1++;
				}
				else {
					
					System.out.print(s1.charAt(c1));
					c1++;
				}
			}
			else {
				if(c2==l2) {
					System.out.print(t2);
					t2++;
				}
				else {
				System.out.print(s2.charAt(c2));
				c2++;
				}
			}
		}
	}		
}
