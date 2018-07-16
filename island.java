import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int a[][] =  new int[n+2][n+2];
        for(int i=0;i<n+2;i++){
            for(int j=0;j<n+2;j++){
                if(i==0 || j==0 || i==n+2-1 ||j==n+2-1)
                    a[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i-1][j]!=1 && a[i+1][j]!=1 && a[i][j-1]!=1 && a[i][j+1]!=1)
                c++;
            }
        }
        System.out.println(c);
    }
}
