
public class EncodeStr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next(); 
		String str2 = s.next(); 
		int a[] = new int[str1.length()];
		int b[] = new int[str2.length()];
 		for (int i = 0 ; i < str1.length() ; i++) {
			a[i] = str1.charAt(i)-96;
		}
 		for (int i = 0 ; i < str1.length() ; i++) {
			b[i] = str2.charAt(i)-96;
		}
 		for(int i = 0 ; i < str1.length() ; i++) {
 			a[i] = a[i] + b[i];
 			 if( a[i]>26 ){
 	             a[i]=a[i]%26;
 	             if( a[i] == 0 )
 	                 a[i] = 26;
 	         }
 			System.out.print((char)(a[i]+96));
 		}
	}

}
