#include <stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    int l1,l2,i,j,t,c=0;
    char str1[50],str2[50],temp;
    scanf("%s%s",str1,str2);
    l1=strlen(str1);
    l2=strlen(str2);
    for(i=0;i<l1;i++)
    {t=i;
        for(j=0;j<l2;j++)
        {
            if(str1[t]==str2[j])
            {
                c++;t++;
                if(c==l2)
                {
                    printf("yes");
                    exit(0);
                }
            }
        }
    }//printf("%d %d\n",c,l2);
    if(c!=l2)
    printf("no");
    return 0;
}
