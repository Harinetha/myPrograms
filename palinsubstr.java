import java.util.Scanner;

public class PalindromeSubStr {

	public static void main(String[] args) {
		int t=0;
		Scanner s = new Scanner(System.in);
		String str=s.next();
		String temp="";
		String rev = "";
		String tempstr = ""; 
		String strary[]=new String[20];
		int l=str.length();
		for( int i = 0; i < l;i++) {
			rev="";
			for(int j = l-1; j > i+1; j--) {
				if(str.charAt(i)==str.charAt(j)) {
					temp = str.substring(i,j+1);
					for(int k=j;k>=i;k--){
						rev=rev+str.charAt(k);
					}
					if(temp.equals(rev)) {
						strary[t++]=temp;
					}
				}
			}
		}
		for(int i = 0; i < t; i++) {
			for(int j = i+1;j < t; j++) {
				if(strary[i].compareTo(strary[j])>0) {
					tempstr = strary[i];
					strary[i] = strary[j];
					strary[j]=tempstr;
				}
			}
		}
		for(int i = 0; i < t; i++) {
			System.out.println(strary[i]);
		}
	}

}
