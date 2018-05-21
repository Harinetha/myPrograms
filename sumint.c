#include<stdio.h>
int main()
{
    int n,i,sum=0,a[100],k;
    scanf("%d%d",&n,&k);
    for(i=0;i<k;i++)
    {
    scanf("%d",&a[i]);
    sum=sum+a[i];
    }
    printf("%d",sum);
    return 0;
}
