#include <stdio.h>

int main()
{
    int n,a,sum=0;
    scanf("%d",&n);
    while(n>9)
    {
        sum=0;
    while(n>0)
    {
        a=n%10;
        sum=sum+a;
        n=n/10;
    }
    n=sum;
    }
    printf("%d",n);
    return 0;
}
