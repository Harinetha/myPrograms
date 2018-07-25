import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l,r,sum=0,num,a,c=0,flag;
		l=s.nextInt();
		r=s.nextInt();
		for(int n = l ; n<=r ;n++) {
			sum=0;
			num=n;
			while(num>0) {
				a=num%10;
				sum = sum + a;
				num=num/10;
			}
			//System.out.println("sum="+sum);
			flag = 0;
			for(int i=2;i<=sum/2;i++) {
				if(sum%i == 0) {
					flag=1;
					break;
				}
			}
			//System.out.println("flag="+flag);
			if(flag == 0 && sum!=1)
				c++;
		}
		System.out.println(c);
	}

}
