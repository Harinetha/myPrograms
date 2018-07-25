import java.util.Scanner;

public class longpalin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		String temp="";
		String oldtemp="";
		String max="";
		String rev = "";
		int l=str.length();
		for( int i = 0; i < l;i++) {
			rev="";
			for(int j = i+1; j <l; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					temp = str.substring(i,j+1);
					//System.out.println(temp);
					for(int k=j;k>=i;k--){
						rev=rev+str.charAt(k);
					}
					if(temp.equals(rev)) {
						if(temp.length()>oldtemp.length())
						max=temp;
						else
						max=oldtemp;
					}
					oldtemp=temp;
				}
			}
		}
		System.out.println(max);
	}

}
