import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
				b[i][j]=a[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(b[i][j]==0) {
					for(int k=0;k<c;k++) {
						a[i][k]=0;
					}
					for(int l=0;l<r;l++) {
						a[l][j]=0;
					}
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}
}
