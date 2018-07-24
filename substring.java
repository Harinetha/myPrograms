import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		int c=1,t;
		Scanner s = new Scanner( System.in );
		String str1 = s.next();
		String str2 = s.next();
		int l1=str1.length();
		int l2=str2.length();
		for( int i = 0; i < l2; i++ ){
			t=i;
	        for( int j = 0; j < l1; j++) {
	            if( str2.charAt(t) == str1.charAt(j) ){
	            	//System.out.println(str2.charAt(t)+" "+str1.charAt(j));
	                if( c == l2 ){
	                    System.out.println("yes");
	                    System.exit(0);
	                }
	                c++;
	                t++;
	            }
	        }
	    }
	    if(c!=l2)
	    System.out.println("no");
	   

	}

}
