import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int c=0,t,flag=0;
		Scanner s = new Scanner( System.in );
		String str1 = s.next();
		String temp = "";
		String max = "";
		int l = str1.length();
		for( int i = 0; i < l; i++ ){
			temp = "";
			flag = 0;
	        for( int j = 0; j < i; j++) {
	        		temp = temp + str1.charAt(j);
	        }
			//System.out.println( temp );
			for(int k = 0; k < temp.length() ;k++){
			    c = 0;
			    for(int m = 0; m < temp.length() ;m++){
			        if( temp.charAt(k) == temp.charAt(m) ){
			            c++;
			        }
			    }
			    if(c > 1){
			    flag=1;
			    break; 
			    }
			}
			if( (flag == 0 )&&(temp.length() > max.length()) )
				max = temp;
	    }
		System.out.println(max.length());
	    
	}

}
