import java.util.Scanner;

public class longest_substring {

	public static void main(String[] args) {
		int c=1,t,flag=0;
		Scanner s = new Scanner( System.in );
		String str1 = s.next();
		String str2 = s.next();
		String temp = "";
		String oldtemp = "";
		String max = "";
		String str_ar[] = new String[25];
		int l1=str1.length();
		int l2=str2.length();
		for( int i = 0; i < l2; i++ ){
			t=i;c=1;
	        for( int j = 0; j < l1; j++) {
	            if( str2.charAt(t) == str1.charAt(j) ){
	            	flag=1;
	            	temp=temp+str2.charAt(t);
	            	if(temp.length()>oldtemp.length())
	            		max = temp;
	            	else
	            		max = temp;
	                c++;
	                t++;
	            }
	            oldtemp=temp;
	        }
	       i=t;
	    }
		System.out.println(max);
	    if(flag==0)
	    System.out.println("no substring exit");
	}

}
