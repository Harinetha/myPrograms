import java.util.Scanner;

public class RmvLongPalin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		String temp="";
		String max="";
		String rev = "";
		int l=str.length();
		for( int i = 0; i < l;i++) {
			temp="";
			rev="";
			for(int j = l-1; j >= i+1; j--) {
				if(str.charAt(i)==str.charAt(j)) {
					temp = str.substring(i,j+1);
					for(int k=j;k>=i;k--){
						rev=rev+str.charAt(k);
					}
				}
			}
			if(temp.equals(rev)) {
				if(temp.length()>max.length())
				max=temp;
			}
		}
		System.out.println(l-max.length());
	}
}
