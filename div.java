import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,max,ans=0,flag=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		max=a>b?a:b;
		for(int i=max;i<=a*b;i++) {
			if((i%a==0)&&(i%b==0)) {
					ans=i;
					flag=1;
			}
			if(flag==1)
				break;
		}
		System.out.println(ans);
	}

}
