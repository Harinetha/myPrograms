import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );
		int endpt = s.nextInt();
		int capacity = s.nextInt();
		int f = s.nextInt();
		int k = s.nextInt();
		int fuel = capacity+1;
		int count = 0;
		
		for ( int i = 1 ; i <= k ; i++)
		{
			if( i % 2 == 0){
				for(int j =1 ; j <= endpt ; j++){
					if( j == f){
						fuel = capacity;
						count++;
					}
					if(fuel == 0){
						System.out.println(count);
						System.exit(0);
						}
					fuel--;
					//System.out.println(fuel);
				}	
			}
			else{
				for(int j = endpt ; j >=1 ; j--){
					if( j == f){
						fuel = capacity;
						count++;
					}
					if(fuel == 0){
						System.out.println(count);
						System.exit(0);
					}
					fuel--;
					//System.out.println(fuel);
				}
			}
	
		}
		System.out.println(count);
	}
}
