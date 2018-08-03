import java.util.Scanner;

public class longIncSubArray {

	public static void main( String[] args ) {
		Scanner s = new Scanner( System.in );
		int n = s.nextInt();
		int a[] = new int[n];
		int c[] = new int[n];
		int count = 1 , j = 0;
		
		for( int i = 0 ; i < n ; i++){
			a[i] = s.nextInt();
		}
		for( int i = 0 ; i < n ; i++){
			
			if (i==n-1){
				c[j++] = count;
			}
			else if( a[i] < a[i+1] ){
				count++;
			}
			else{
				c[j++] = count;
				count = 1;
			}
		}
		int max = 0;
		for( int i = 0 ; i < j ; i++){
			//System.out.println(c[i]);
				if(c[i] > max)
					max = c[i];
		}
		System.out.println(max);

	}

}
