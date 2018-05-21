#include <stdio.h>
#include<string.h>
int main()
{
    int l,max=0,i,j,k,count=0;
    char str[100],t;
    scanf("%s",str);
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        for(j=i+1;j<l;j++)
        {
            if(str[i]==str[j])
            {
                count++;
                for(k=j;k<l;k++)
                str[k]=str[k+1];
                l--;
                if(count>max)
                {
                max=count;
                t=str[i];
                }
            }
        }
    }
    printf("%c",t);
    return 0;
}
