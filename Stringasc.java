import java.util.Scanner;

public class stringasc {

	public static void main(String[] args) {
		int t=0;
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String tempstr = ""; 
		String strary[]=new String[n];
		for(int i = 0 ; i < n ;i++) {
			strary[i] = s.next();
		}
		for(int i = 0; i < n; i++) {
			strary[i] = strary[i].toLowerCase();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(strary[i].compareTo(strary[j])>0) {
					tempstr = strary[i];
					strary[i] = strary[j];
					strary[j]=tempstr;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(strary[i]);
		}
	}

}

