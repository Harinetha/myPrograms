#include <stdio.h>
int main()
{
    int i,j,k,n,a[i],c=0,t;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=0;j<n;j++)
        {
            if(a[i]==a[j])
            c++;
            while(c==2)
            goto t;
        }
        t:
        if(c==1)
        printf("%d",a[i]);
    }
    return 0;
}
