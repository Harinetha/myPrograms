#include <stdio.h>
#include <string.h>
int main()
{
    char str1[20],str2[20],a,b;
    int c=0,l1,l2,i,k;
    scanf("%s",str1);
    scanf("%s",str2);
    l1=strlen(str1);
    l2=strlen(str2);
    for(i=0;i<l1;i++){
        a=str1[i];
        b=str2[i];
        for(k=0;k<l1;k++){
            if((str1[k]==a && str2[k]!=b)||(str1[k]!=a && str2[k]==b))
                c=1;
            }
    }
    if(c==0)
    printf("yes");
    else
    printf("no");
    return 0;
}
