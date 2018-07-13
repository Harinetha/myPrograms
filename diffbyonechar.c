#include <stdio.h>
#include <string.h>
int main()
{
    char str1[20],str2[20];
    int c=0,l1,l2,i;
    scanf("%s",str1);
    scanf("%s",str2);
    l1=strlen(str1);
    l2=strlen(str2);
    for(i=0;i<l1;i++){
        if(str1[i]!=str2[i])
        c++;
    }
    if(c==1)
    printf("yes");
    else
    printf("no");
    return 0;
}
