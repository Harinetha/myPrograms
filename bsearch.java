import java.util.*;
class Main
{
    int binarySearch(int a[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l+(r - l)/2;
            //System.out.println( mid+" "+l+" "+r);
            if (a[mid] == x)
               return mid;
            if (a[mid] > x)
               return binarySearch(a, l, mid-1, x);
            else
            return binarySearch(a, mid+1, r, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Main ob = new Main();
        Scanner s=new Scanner(System.in);
        int a[] =  new int[20];
        int n=s.nextInt();
        int x =s.nextInt();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int result = ob.binarySearch(a,0,n-1,x);
        if (result == -1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
