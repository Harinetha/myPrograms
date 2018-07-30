import java.util.Scanner;
public class Encode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int count = 1;
		int l = str.length();
		for(int i = 0; i < l ; i++) {
			if((i == l-1)){
				if(count > 1)
					System.out.print(str.charAt(i)+"*"+count);	
				else
					System.out.print(str.charAt(i));
			}
			else if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else
			{	if(count > 1)
					System.out.print(str.charAt(i)+"*"+count);	
				else
					System.out.print(str.charAt(i));
				count = 1;
			}
			
		
		}
	}
}
