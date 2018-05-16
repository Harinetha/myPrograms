#include <stdio.h>
int main()
{
    int n,p,t=1,i;
    scanf("%d%d",&n,&p);
    for(i=0;i<p;i++)
    {
        t=t*n;
    }
    printf("%d",t);
    return 0;
}
