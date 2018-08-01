import java.util.*;
public class sumk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int a[] = new int[n];
		int flag = 0;
		for(int i = 0; i< n ; i++){
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i < n; i++){
			for( int j = 0; j< n; j++){
				if(a[i]+a[j]==k){
					flag = 1;
					System.out.println("yes");
					System.exit(0);
				}
			}
		}
		if(flag == 0)
			System.out.println("no");
	}

}
