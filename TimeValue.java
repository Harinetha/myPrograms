import java.util.*;
public class TimeValue {

	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in );
		int iptime = s.nextInt();
		int ipvalue = 3;
		int value = ipvalue;
		int a[] = new int[iptime+1];
		for( int i = 1 ; i <= iptime ; i++){
			a[i] = value;
			value--;
			if( value == 0 ){
				ipvalue = ipvalue * 2 ;
				value = ipvalue;
			}
		}
		//for(int i = 1 ; i <= iptime ;i++)
			//System.out.println(a[i]);
		System.out.println(a[iptime]);
	}
}
